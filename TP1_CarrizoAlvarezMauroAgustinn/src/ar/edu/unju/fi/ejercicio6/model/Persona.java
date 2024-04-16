package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Persona {

private Integer dni;
private String nombre;
private LocalDate FechaNac;
private String provincia;
private int fechaActual = Calendar.DAY_OF_MONTH;

public Persona() {
	
}



public Integer getDni() {
	return dni;
}

public void setDni(Integer dni) {
	this.dni = dni;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public LocalDate getFechaNac() {
	return FechaNac;
}

public void setFechaNac(LocalDate fechaNac) {
	FechaNac = fechaNac;
}

public String getProvincia() {
	return provincia;
}

public void setProvincia(String provincia) {
	this.provincia = provincia;
}

public int getFechaActual() {
	return fechaActual;
}

public void setFechaActual(int fechaActual) {
	this.fechaActual = fechaActual;
}
public Persona(Integer dni, String nombre, LocalDate fechaNac, String provincia, int fechaActual) {
	
	this.dni = dni;
	this.nombre = nombre;
	FechaNac = fechaNac;
	this.provincia = provincia;
	this.fechaActual = fechaActual;
}








public Persona(Integer dni, String nombre, LocalDate fechaNac ) {
	
	this.dni = dni;
	this.nombre = nombre;
	FechaNac = fechaNac;
	this.provincia = "Jujuy";
}



@Override
public String toString() {
	return "Persona [dni=" + dni + ", nombre=" + nombre + ", FechaNac=" + FechaNac + ", provincia=" + provincia + "]";
}


public void calcularEdad() {


	LocalDate fechaActual = LocalDate.now();
	Period period = Period.between(FechaNac, fechaActual);
	//System.out.printf("La edad es: %s años, %s meses y %s dias,period.getYear();	"
	System.out.printf("La edad es: %s años, %s meses y %s días",
	                period.getYears(), period.getMonths(), period.getDays());


}
public void calculoMayor() {
	//boolean bandera=false; 
	LocalDate fechaActual = LocalDate.now();
	Period period = Period.between(FechaNac, fechaActual);
	//System.out.printf("La edad es: %s años, %s meses y %s dias,period.getYear();	"
	//System.out.printf("La edad es: %s años, %s meses y %s días",
	  //              period.getYears(), period.getMonths(), period.getDays());

int edad = period.getYears();
if ( edad >= 18) {	
	boolean bandera = true;
	
	System.out.println(bandera);
	//else  {
///	boolean bandera = false;
//System.out.println("es menor");
	}	
		

}
public void mostrarDatos() {
	LocalDate fechaActual = LocalDate.now();
	Period period = Period.between(FechaNac, fechaActual);
	//System.out.printf("La edad es: %s años, %s meses y %s dias,period.getYear();	"
	//System.out.printf("La edad es: %s años, %s meses y %s días",
	  //              period.getYears(), period.getMonths(), period.getDays());
	int edad = period.getYears();
if 	( edad <= 18) {	
	System.out.println("Datos de la persona: dni = " + dni + ", nombre = " + nombre + ", FechaNac = " + FechaNac + ", provincia = " + provincia + "  "+ "   Es menor de edad");
}
else {
	System.out.println("Datos de la persona: dni = " + dni + ", nombre = " + nombre + ", FechaNac = " + FechaNac + ", provincia = " + provincia + "  "+ "   Es mayor de edad");
}


}
}









