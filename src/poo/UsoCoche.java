package poo;

import javax.swing.JOptionPane;

public class UsoCoche {

	public static void main(String[] args) {
		Coche micoche = new Coche();
		micoche.configura_asientos(JOptionPane.showInputDialog("Introduce asientos"));
		System.out.println(micoche.dime_datos_generales());
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		System.out.println(micoche.dime_color());
		System.out.println(micoche.dime_asientos());
		micoche.configura_climatizador(JOptionPane.showInputDialog("Introduce climatizador"));
		System.out.println(micoche.dime_climatizador());
		System.out.println(micoche.dime_peso_coche());
		System.out.println("El precio final del cohce es: " + micoche.precio_coche());
	}

}
