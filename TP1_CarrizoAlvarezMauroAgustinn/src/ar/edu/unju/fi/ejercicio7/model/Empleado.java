package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
private String noombre;
private Integer legajo;
private double salario;


public Empleado(String noombre, Integer legajo, double salario) {
	super();
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

	
public void calculoMinimo();{
if (salrio >= 2000)

}
}