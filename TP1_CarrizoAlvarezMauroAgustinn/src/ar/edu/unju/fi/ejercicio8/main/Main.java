package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;


import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	Scanner scanner = new Scanner (System.in);
	//System.out.println("Ingrese un numero entero: ");
	int n = scanner.nextInt();
	CalculadoraEspecial  calculo = new CalculadoraEspecial() ;
	
	calculo.calcularSumatoria(n);
	calculo.calcularProductoria(n);
	
	
	}
}