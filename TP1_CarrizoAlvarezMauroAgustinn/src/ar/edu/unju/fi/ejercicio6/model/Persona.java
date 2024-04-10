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
	
}

