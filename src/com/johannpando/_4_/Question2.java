package com.johannpando._4_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Question2 {

	public static void main(String[] args){
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog("Lazy", "John", 3));
		dogList.add(new Dog("White", "Henry", 2));
		dogList.add(new Dog("Blaky", "Bert", 5));
		dogList.add(new Dog("Tazan", "Jack", 1));
		
		Sort1 s1 = new Sort1();
		Collections.sort(dogList, s1);
		System.out.println(dogList);
		
		Sort2 s2 = new Sort2();
		Collections.sort(dogList, s2);
		System.out.println(s2);
	}
	
	static class Sort1 implements Comparator<Dog>{
		public int compare(Dog first, Dog second){
			return first.name.compareTo(second.name);
		}
	}
	
	static class Sort2 implements Comparator<Dog>{
		public int compare(Dog first, Dog second) {
			return first.owner.compareTo(second.owner);
		}
	}
}

class Dog {
	String name;
	int age;
	String owner;
	
	Dog(String n, String o, int a){
		name = n;
		owner = o;
		age = a;
	}
	
	public String toString(){
		return owner;
	}
}

