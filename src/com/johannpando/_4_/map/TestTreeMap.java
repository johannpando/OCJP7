package com.johannpando._4_.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestTreeMap {

	public static void main(String[] args) {

		Map<Alumno, Integer> treeMap = new TreeMap<>();
		// Si la clase Alumno no implementa la interface Comparable, se
		// producirá una excepción en tiempo de ejecución.

		// Implementando Comparator, no funciona sigue reproduciéndose el mismo
		// error.

		// Exception in thread "main" java.lang.ClassCastException:
		// com.johannpando._4_.map.Alumno cannot be cast to java.lang.Comparable

		// Implementando la interface comparable en la clase ALumno, ordena
		// correctamente.

		treeMap.put(new Alumno("Juan", "Ferrando"), 1);
		treeMap.put(new Alumno("Ana", "Garcia"), 2);
		treeMap.put(new Alumno("Zoila", "Valenzuela"), 3);

		for (Integer valor : treeMap.values()) {
			System.out.print(valor + " ");
		}

		// Imprime 2 (Ana), 1 (Juan), 3 (Zoila)

		System.out.println(System.getProperty("line.separator"));

		Map<Alumno, Integer> treeMap2 = new TreeMap<>(new MyComparator());
		treeMap2.put(new Alumno("Juan", "Iriarte"), 1);
		treeMap2.put(new Alumno("Ana", "Pastor"), 2);
		treeMap2.put(new Alumno("Zoila", "Buendía"), 3);

		for (Integer valor : treeMap2.values()) {
			System.out.print(valor + " ");
		}

		// Imprime 3 (Buendía), 1 (Iriarte), 3 (Pastor)

		Set<String> ordenado = new TreeSet<>();
		ordenado.add("01");
		ordenado.add("011");
		ordenado.add("010");
		ordenado.add("09");
		ordenado.add("chapter01");
		ordenado.add("chapter011");
		ordenado.add("chapter010");
		ordenado.add("chapter09");

		for (String string : ordenado) {
			System.out.println(string);
		}

	}

}

class Alumno implements Comparable<Alumno> {
	String name;
	String apellido;

	public Alumno(String name, String apellido) {
		this.name = name;
		this.apellido = apellido;
	}

	@Override
	public int compareTo(Alumno o) {
		return name.compareTo(o.name);
	}

}

class MyComparator implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		return o1.apellido.compareTo(o2.apellido);
	}

}