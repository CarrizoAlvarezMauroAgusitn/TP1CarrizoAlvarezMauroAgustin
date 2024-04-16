package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
private int n;

public int getN() {
	return n;
}

public void setN(int n) {
	this.n = n;
}

public CalculadoraEspecial(int n) {
	this.n = n;
}
public CalculadoraEspecial() {
	// TODO Auto-generated constructor stub
}

public void calcularSumatoria(int n) {

int resultado = 1;
for (int k = 1; k<=n;k++) {
	double termino = ((k*(k+1))/2)^2;
	resultado += termino ;
	//System.out.println("Resultado de la sumatoria: " + resultado);
}
}

public void calcularProductoria (int n) {
	int resultado = 1;
	for (int k = 1; k <=n; k++) {
		resultado = resultado*k*(k+4);
		//System.out.println("Resultado de la productoria: " + resultado);
	}
	System.out.println("Resultado de la sumatoria: " + resultado);

	System.out.println("Resultado de la productoria: " + resultado);

}
}