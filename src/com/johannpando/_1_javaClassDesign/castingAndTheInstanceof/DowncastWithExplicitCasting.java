package com.johannpando._1_javaClassDesign.castingAndTheInstanceof;

public class DowncastWithExplicitCasting {

	static void llamaDownCasting(ShoppingItem item){
		
		// 1.- Si la variable 'item' en tiempo de ejecución es de la clase base (shoppingItem)
		// Haciendo downcasting explícito, el código compila correctamente
		// Pero en tiempo de ejecución, el objeto es de tipo ShoppingItem y 
		// No se puede asignar una variable de la clase base a una variable
		// De su clase derivada o hija.
		
		
		// 2.- Si la variable en tiempo de ejecución es de tipo Book (Book es un ShoppingItem)
		// El downcasting explícito ejecutará correctamente.
		Book b = (Book) item;
	}
	
	public static void main(String[] args) {
		ShoppingItem s = new ShoppingItem();
		//llamaDownCasting(s);
		
		ShoppingItem sb = new Book();
		llamaDownCasting(sb);
	}

}


interface Printable{
	void print();
}

class ShoppingItem {
	
	void description() {
		System.out.println("ShoppingItem");
	}
}

class Chair extends ShoppingItem{
	void description(){
		System.out.println("Chair");
	}
}

class Book extends ShoppingItem implements Printable {

	@Override
	public void print() {
		System.out.println("Imprime Book");
	}
	
}