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
	
	
//public double calcularDescuento (double precio, double decuento)	{
//int porciento = 100; 
//double precioFinal =(descuento * precio)/(.100);
	//this.descuento=descuento;
	//this.descuento = descuento;
	//double descuentoFinal =(descuento/100)*precio; 
	//double precioFinal =precio-descuentoFinal;
	//System.out.println("el precio final es: " + precioFinal);
	//return precioFinal;
//}	
	
public void calcularDescuento (double precio, double descuento)	{
	//int porciento = 100; 
	//double precioFinal =(descuento * precio)/(.100);
		//this.descuento=descuento;
		//this.descuento = descuento;
		double descuentoFinal =(descuento/100)*precio; 
		double precioFinal =precio-descuentoFinal;
		System.out.println("el precio final es: " + precioFinal);
}
}
//System.out.println("el precio final es: " + precioFinal);