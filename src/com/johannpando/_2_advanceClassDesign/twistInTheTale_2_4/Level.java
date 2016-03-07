package com.johannpando._2_advanceClassDesign.twistInTheTale_2_4;

enum Level {

	BEGGINER;
	
	static {
		System.out.println("static init block");
	}
	
	Level(){
		System.out.println("constructor");
	}
	
	public static void main(String args[]){
		System.out.println(Level.BEGGINER);
	}
}


class A{
	
}

class B extends A{
	
}