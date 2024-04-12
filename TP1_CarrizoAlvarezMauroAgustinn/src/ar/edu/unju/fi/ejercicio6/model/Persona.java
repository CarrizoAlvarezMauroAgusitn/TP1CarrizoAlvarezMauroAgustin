package ar.edu.unju.fi.ejercicio6.model;
import java.time.LocalDate;

import javax.swing.JOptionPane;
public class Persona {

private String dni;
private String nombre;
private int fechaNa;
private String provincia;

public void leerfecha() {
fechaNa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese fecha de nacimiento: "));

}

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


@Override
public String toString() {
	return "Persona [dni=" + dni + ", nombre=" + nombre + ", fechaNa=" + fechaNa + ", provincia=" + provincia + "]";
}
	
}

