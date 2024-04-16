package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.model.Producto;



public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Producto prodcuto1 = new Producto();
int numProducto = 1;
while (numProducto <=3) {
System.out.println("Ingrese nombre: ");
String nombre = scanner.next();
scanner.nextLine();		
System.out.println("Ingrese codigo: ");

Integer codigo = scanner.nextInt();

System.out.println("Ingrese precio: ");
double precio = scanner.nextDouble();
System.out.println("Ingrese descuento: ");

double descuento = scanner.nextInt();
prodcuto1.calcularDescuento(precio, descuento);

numProducto++;
}	
}
}
