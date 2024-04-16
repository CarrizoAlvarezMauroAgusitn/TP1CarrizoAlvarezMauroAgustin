package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class EstructuraControlCondicional {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);	
System.out.println("ingrese un numero");
int numero;
numero = teclado.nextInt();	
		if (numero % 2 == 0 ) {
		System.out.println("El numero es par");
	} else {
	System.out.println("El numero es impar");
	}
 
 
	
	}

}
