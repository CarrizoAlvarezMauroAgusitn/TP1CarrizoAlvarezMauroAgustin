package ar.edu.unju.fi.ejercicio6.model;

import java.util.Calendar;

public class Persona {

private String dni;
private String nombre;
private int fechaNa;
private String provincia;
private int fechaActual = Calendar.DAY_OF_MONTH;




//public void leerFecha() {
//int edad = Math.abs(fechaNa - fechaActual); 
//System.out.print("La edad es: "+ edad);
//}








//METODOS ACCESORES
public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getFechaNa() {
	return fechaNa;
}

public void setFechaNa(int fechaNa) {
	this.fechaNa = fechaNa;
}

public String getProvincia() {
	return provincia;
}

public void setProvincia(String provincia) {
	this.provincia = provincia;
}


public void leerFecha() {
int edad = Math.abs(fechaNa - fechaActual); 
System.out.print("La edad es: "+ edad);
}


//@Override
//public String toString() {
	//return "Persona [dni=" + dni + ", nombre=" + nombre + ", fechaNa=" + fechaNa + ", provincia=" + provincia + "]";
}
	
//}

