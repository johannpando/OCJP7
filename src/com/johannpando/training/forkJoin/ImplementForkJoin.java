package com.johannpando.training.forkJoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Vamos a aplicar el framework fork/join con un simple ejemplo de calcular la
 * suma de un array de integers, dividiéndolo en pequeñas tareas de cálculo de
 * la suma de sus subarrays que se ejecutan como tareas asíncronas. En esta
 * ejemplo trabajaremos con ForkJoinPool y RecursiveTask
 * 
 * 
 * En el presente código, en la línea 1 se define la clase CalcSum, el cual
 * extiende de RecursiveTask<Integer>. Este parámetro, Integer, es el tipo del
 * valor de retorno por el método compute(). El método compute(), definido en la
 * línea 2, es llamado una vez por la tarea principal cuando invoke() es llamado
 * sobre una instancia de ForkJoinPool, pasándole un objeto de CalcSum. También
 * es llmado cuando fork() es llamado sobre una instancia de RecursiveTask.
 * Método compute() calcula el tamaño del array y compara con una unidad de
 * tamaña, en nuestro ejemplo UNIT_SIZE=15. Si es menor que esta unidad de
 * medida, computa la suma de sus elementos del array usando computeSum() en la
 * línea 5. Si el tamaño del array es mayor, crea una instancia de CalcSum,
 * pasándole la mitad de la izquierda del array. En la línea 4, llama a
 * compute() a la parte derecha y join() a la parte izquierda. Llamando a
 * compute() se creará recursivamente (izquierda y derecha) objetos de CalcSum,
 * si sigue siendo necesario dividirlo dentro de tareas más pequeñas. Llamando a
 * join() retornará el resultado de la computación cuando termine. Método main()
 * crea un array intArray y lo inicializa generando valores aleatorios usando la
 * clase Random. El código en la línea 6 crea un ForkJoinPool. El código en la
 * línea 7 llama a invoke() el cual ejecuta la tarea dad retornando su resultado
 * en la finalización.
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
		// 7.- Método invoke espera y obtiene resultados.
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

	// 2.- Par CalcSum, sobreescribimos el método compute que retorna un valor
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
			// 3.- Invocamos al método fork sobre leftSum haciendo ejecutarlo
			// asíncronamente
			leftSum.fork();

			int rightStart = startPos + center + 1;
			CalcSum rightSum = new CalcSum(values, rightStart, endPos);
			// 4.- leftSum.join, espera hasta que se retorne un valor; compute
			// is la computación principal relizado por una tarea.
			return (rightSum.compute() + leftSum.join());
		}
	}

	// 5.- Método privado helper
	private Integer computeSum() {
		int sum = 0;
		for (int i = startPos; i < endPos; i++) {
			sum += values[i];
		}
		System.out.println("Sum(" + startPos + "-" + endPos + "):" + sum);
		return sum;
	}
}
