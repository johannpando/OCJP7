package com.johannpando.chapter5;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {

		String input = "10 apples 20 oranges 33 pears";
		// The expression \\d will be required to match a digit. The "*"
		// quantifier is used to match zero or more occurrences of it. There are
		// zero digits between the letters in the String, so they are also
		// considered matches for "*". So it splits the String into 'a', 'p, 'p'
		// and so on, this exceeding the bounds of the array str.
		Scanner s = new Scanner(input).useDelimiter("\\d*");

		String[] sp = input.split("\\d*");
		for (String string : sp) {
			System.out.print(string + " ");
		}
		System.out.println("long split: " + sp.length);

		String str[] = new String[6];

		int i = 0;
		while (s.hasNext()) {
			//str[i] = s.next();
			
			//System.out.println(str[i]);
			//System.out.println(str[i++]);
			System.out.println(s.next());
			i++;
		}
		
		System.out.println("Valor de i: " + i);
		s.close();
	}

}
