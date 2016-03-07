package com.johannpando.chapter4;

import java.util.List;

public class Question32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void addString(List<String> list) {
		list.add("Smith");
	}

	public static void addString2(List<? extends String> list) {

		// The method add(capture#1-of ? extends String) in the type
		// List<capture#1-of ? extends String> is not applicable for the
		// arguments (String)
		//list.add("Smith");
	}

	public static void addString3(List<? super String> list) {
		list.add("Smith");
	}
}
