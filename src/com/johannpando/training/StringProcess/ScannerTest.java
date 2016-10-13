package com.johannpando.training.StringProcess;

import java.io.FileInputStream;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("/Users/Johann/git/OCJP7/source/myCsv.csv");
		Scanner sc = new Scanner(fis);
		sc.useDelimiter(",");
		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				System.out.println(sc.nextDouble());
			} else {
				System.out.println(sc.next());
			}
		}
	}

}
