package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese el nombre del empleado: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese el legajo del empleado: ");
		int legajo = scanner.nextInt();
		//System.out.println("Ingrese el salario del empleado: ");
		double salario = scanner.nextDouble();
Empleado empleado = new Empleado(nombre,legajo, salario);
	
	empleado.mostrarDatos();
	empleado.darAumento();
	System.out.println("despues del aumento: ");
	empleado.mostrarDatos();
	
	
	
	}

}
