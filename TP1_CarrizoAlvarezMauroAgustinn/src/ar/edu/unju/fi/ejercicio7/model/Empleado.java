package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
private String noombre;
private Integer legajo;
private double salario;


public Empleado(String noombre, Integer legajo, double salario) {
	this.noombre = noombre;
	this.legajo = legajo;
	this.salario = salario;
}


public String getNoombre() {
	return noombre;
}


public void setNoombre(String noombre) {
	this.noombre = noombre;
}


public Integer getLegajo() {
	return legajo;
}


public void setLegajo(Integer legajo) {
	this.legajo = legajo;
}


public double getSalario() {
	return salario;
}


public void setSalario(double salario) {
	this.salario = salario;
}


public static final double SALARIO_MINIMO = 210000.00 ;
public static final double AUMENTO = 20000.00;
public void calculoMinimo() {

if (salario <= SALARIO_MINIMO) {
	this.salario = SALARIO_MINIMO ;	
	 }
else {
	this.salario = salario;
}
}
public void mostrarDatos() {

System.out.println("Empleado Nombre=" + noombre + ", legajo=" + legajo + ", salario=" + salario  );
}
public void darAumento() {
		if (salario <= SALARIO_MINIMO) {
			salario = salario + AUMENTO;	
		}
		 
	else {
		this.salario = salario;
		
}
}
}
