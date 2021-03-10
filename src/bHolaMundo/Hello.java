package bHolaMundo;

import libs.Input;

public class Hello {

	public static void main(String[] args) {

		System.out.println("Hola");
		System.out.println("hello, world\n");  //funcion para imprimir en consola
		String name= Input.get_string("dame tu nombre");
		System.out.println("tu nombre es" +name);
		int x= Input.get_int(" dame un numero");
		System.out.println("tu numero es"+ x);
	}
}

