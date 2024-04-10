package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class EstructuraControlWhile {

public static void main(String[] args) {
		
	// TODO Auto-generated method stub
	int a;
	int fact =1 ;
	Scanner teclado = new Scanner(System.in);	
System.out.println("ingrese un numero");
	a= teclado.nextInt();
int contador=a;
if(a >= 0 && a <=10) {

while (contador > 0) {
	System.out.println(contador + " ");
	fact = (fact*contador);
	contador --;
}
System.out.println("\n");
System.out.println("El factorial de " + a + " es; " + fact);
}
 else {
	System.out.println("el numero no esta en el rango");
}
}
}
