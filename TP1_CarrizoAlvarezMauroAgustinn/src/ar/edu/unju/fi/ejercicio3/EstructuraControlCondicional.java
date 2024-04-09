package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class EstructuraControlCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner teclado = new Scanner(System.in);	
 System.out.println("ingrese un numero");		
 String numero1 = teclado.next();
double n = Double.parseDouble(numero1);	
//int n = numero1;	
 //int numero = 7;
		//int n = n%2;
		//System.out.println("resultado: "+numeroFloat);
		if (n%2=0 ) {
		System.out.println("El numero es par");
	} else {
		System.out.println("El numero es impar");
	}
 
 
	
	}

}
