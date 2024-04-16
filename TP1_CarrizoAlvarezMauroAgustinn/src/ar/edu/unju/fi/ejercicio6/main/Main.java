package ar.edu.unju.fi.ejercicio6.main;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	

	public static void main(String[] args) {
	
		Persona persona1 = new Persona();		
		//Persona persona2 = new Persona();
		Scanner scanner = new Scanner(System.in);
int numPersonas = 1;
while (numPersonas <= 2) {
System.out.println("Ingrese DNI: ");

Integer dni = scanner.nextInt();
System.out.println("Ingrese nombre: ");
String nombre = scanner.next();
scanner.nextLine();
System.out.print("Ingrese fecha de nacimento:  ");
String fechaNacString = scanner.nextLine();
//SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate FechaNac = LocalDate.parse(fechaNacString,formatter);


//System.out.print("Ingrese Provincia: ");
String provincia = scanner.nextLine();
//scanner.nextLine();

persona1.setDni(dni);
persona1.setNombre(nombre);
persona1.setFechaNac(FechaNac);
persona1.setProvincia(provincia);

persona1.calcularEdad();	


persona1.calculoMayor();	

persona1.mostrarDatos();
numPersonas++;	
	}

System.out.println("Ingrese DNI: ");

Integer dni = scanner.nextInt();
System.out.println("Ingrese nombre: ");
String nombre = scanner.next();
scanner.nextLine();
System.out.print("Ingrese fecha de nacimento:  ");
String fechaNacString = scanner.nextLine();
//SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate FechaNac = LocalDate.parse(fechaNacString,formatter);
Persona persona2 = new Persona(dni, nombre, FechaNac);
	
	}
}