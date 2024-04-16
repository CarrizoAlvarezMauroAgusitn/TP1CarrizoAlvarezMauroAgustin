package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;
public class EstructuraControlFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner teclado = new Scanner(System.in);	
	//System.out.println("Ingrese un numero;");
		num= teclado.nextInt();
	
	if(num >= 1 && num <=9) {

		for		 (int i=0;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		
		
		
	}	
	}
		else {
			System.out.println("el numero no esta en el rango");
			}	
	}


}
