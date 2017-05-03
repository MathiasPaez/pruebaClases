package remiseria;

public class Main {

	public static void main(String[] args) {
		Direccion casa = new Direccion("Ciudadela", 0, 0, 0, "3 de febrero", 0);
		Cliente pedro = new Cliente("Pepito", 0, 0, 0);
		Chofer armando = new Chofer("Licencia", "Armando", 0, "Ford", 0, 0);
		float costo = 10;

		Viaje recorrido = new Viaje(casa, casa, costo, armando, pedro,
				FormaDePago.EFECTIVO);

		Patente miPatente = new Patente("AAA000", 0);
		Vehiculo coche = new Vehiculo(miPatente, "Renault", "modelo", Coloraso.azul,
				" armando", " Bueno");

		System.out.println("FIN");
	}

}
