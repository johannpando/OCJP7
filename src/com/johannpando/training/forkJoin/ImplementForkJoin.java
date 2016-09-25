package com.johannpando.training.forkJoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Vamos a aplicar el framework fork/join con un simple ejemplo de calcular la
 * suma de un array de integers, dividi�ndolo en peque�as tareas de c�lculo de
 * la suma de sus subarrays que se ejecutan como tareas as�ncronas. En esta
 * ejemplo trabajaremos con ForkJoinPool y RecursiveTask
 * 
 * 
 * En el presente c�digo, en la l�nea 1 se define la clase CalcSum, el cual
 * extiende de RecursiveTask<Integer>. Este par�metro, Integer, es el tipo del
 * valor de retorno por el m�todo compute(). El m�todo compute(), definido en la
 * l�nea 2, es llamado una vez por la tarea principal cuando invoke() es llamado
 * sobre una instancia de ForkJoinPool, pas�ndole un objeto de CalcSum. Tambi�n
 * es llmado cuando fork() es llamado sobre una instancia de RecursiveTask.
 * M�todo compute() calcula el tama�o del array y compara con una unidad de
 * tama�a, en nuestro ejemplo UNIT_SIZE=15. Si es menor que esta unidad de
 * medida, computa la suma de sus elementos del array usando computeSum() en la
 * l�nea 5. Si el tama�o del array es mayor, crea una instancia de CalcSum,
 * pas�ndole la mitad de la izquierda del array. En la l�nea 4, llama a
 * compute() a la parte derecha y join() a la parte izquierda. Llamando a
 * compute() se crear� recursivamente (izquierda y derecha) objetos de CalcSum,
 * si sigue siendo necesario dividirlo dentro de tareas m�s peque�as. Llamando a
 * join() retornar� el resultado de la computaci�n cuando termine. M�todo main()
 * crea un array intArray y lo inicializa generando valores aleatorios usando la
 * clase Random. El c�digo en la l�nea 6 crea un ForkJoinPool. El c�digo en la
 * l�nea 7 llama a invoke() el cual ejecuta la tarea dad retornando su resultado
 * en la finalizaci�n.
 * 
 * @author Johann
 *
 */
public class ImplementForkJoin {

	public static void main(String[] args) {
		int[] intArray = new int[100];
		Random randomValues = new Random();

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = randomValues.nextInt(10);
		}

		// 6.- Instancia un ForkJoinPool
		ForkJoinPool pool = new ForkJoinPool();
		CalcSum calculator = new CalcSum(intArray);
		// 7.- M�todo invoke espera y obtiene resultados.
		System.out.println(pool.invoke(calculator));
	}

}

// 1.- CalcSum extiende de RecursiveTask<Integer>
class CalcSum extends RecursiveTask<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int UNIT_SIZE = 15;
	private int[] values;
	private int startPos;
	private int endPos;

	public CalcSum(int[] values) {
		this(values, 0, values.length);
	}

	public CalcSum(int[] values, int startPos, int endPos) {
		this.values = values;
		this.startPos = startPos;
		this.endPos = endPos;
	}

	// 2.- Par CalcSum, sobreescribimos el m�todo compute que retorna un valor
	// integer.
	@Override
	protected Integer compute() {
		final int currentSize = endPos - startPos;
		if (currentSize <= UNIT_SIZE) {
			return computeSum();
		} else {
			int center = currentSize / 2;
			int leftEnd = startPos + center;
			CalcSum leftSum = new CalcSum(values, startPos, leftEnd);
			// 3.- Invocamos al m�todo fork sobre leftSum haciendo ejecutarlo
			// as�ncronamente
			leftSum.fork();

			int rightStart = startPos + center + 1;
			CalcSum rightSum = new CalcSum(values, rightStart, endPos);
			// 4.- leftSum.join, espera hasta que se retorne un valor; compute
			// is la computaci�n principal relizado por una tarea.
			return (rightSum.compute() + leftSum.join());
		}
	}

	// 5.- M�todo privado helper
	private Integer computeSum() {
		int sum = 0;
		for (int i = startPos; i < endPos; i++) {
			sum += values[i];
		}
		System.out.println("Sum(" + startPos + "-" + endPos + "):" + sum);
		return sum;
	}
}
