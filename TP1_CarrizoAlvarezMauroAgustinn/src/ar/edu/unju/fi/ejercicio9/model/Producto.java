package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
private String Nombre;
private int codigo;
private double precio;
private double descuento;


public Producto(String nombre, int codigo, double precio, int descuento) {
	
	this.Nombre = nombre;
	this.codigo = codigo;
	this.precio = precio;
	this.descuento = descuento;
}

	
public Producto () {
}	

	
public void calcularDescuento (double precio, double descuento)	{
	
		double descuentoFinal =(descuento/100)*precio; 
		double precioFinal =precio-descuentoFinal;
		System.out.println("el precio final es: " + precioFinal);
}
}
