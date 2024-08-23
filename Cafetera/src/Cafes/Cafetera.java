package Cafes;

public class Cafetera {

	public static void main(String[] args) {
		Cafe Cappu = new Cappucino(0.25, 0.50, 0.35, 1);
		Cappucino cappu2 = new Cappucino();
		Vendedor Juancito = new Vendedor(cappu2, 3.0);
		System.out.println("El precio es: " + Juancito.calcularPrecioFinal());
	}

}
