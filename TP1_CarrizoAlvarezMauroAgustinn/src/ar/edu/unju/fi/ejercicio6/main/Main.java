package ar.edu.unju.fi.ejercicio6.main;
import java.util.Calendar;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona edad = new Persona ();
		Persona persona1 = new Persona();		
		int fechaActual = Calendar.DAY_OF_MONTH;
		Scanner scanner = new Scanner(System.in);
		
System.out.print("Ingrese DNI: ");
//persona1.setDni(scanner.nextInt(););
int dni = scanner.nextInt();
System.out.print("Ingrese nombre: ");
String nombre = scanner.nextLine();
scanner.nextLine();

//System.out.print("Ingrese Fecha de nacimento (dd/mm/yy): ");
//String fechaNacString = scanner.nextLine();
//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
//LocalDate fechaNac = LocalDate.parse(fechaNacString,formatter);
//System.out.print(formatter.format(fechaNac));

System.out.print("Ingrese Fecha de nacimento: ");
String fechaString = scanner.next();
DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate fecha = LocalDate.parse(fechaString, formatoFecha);
	
//System.out.print("la fecha es: " + fecha);

System.out.print("Ingrese Provincia: ");
String provincia = scanner.nextLine();
scanner.nextLine();

	//Persona persona1 = new Persona();
	//persona1.set
	
	}
}