package poo;

public class UsoCoche {

	public static void main(String[] args) {
		Coche renault = new Coche();
		renault.configura_asientos("si");
		System.out.println(renault.dime_datos_generales());
		renault.establece_color("amarillo");
		System.out.println(renault.dime_color());
		System.out.println(renault.dime_asientos());
	}

}
