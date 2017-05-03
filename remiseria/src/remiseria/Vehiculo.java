package remiseria;

public class Vehiculo {
	Patente Patente;
	String marca;
	String modelo;
	Coloraso color;
	String chofer;
	String estado;

	public Vehiculo(Patente pat, String mar, String mo, Coloraso co, String cho,
			String esta) {
           Patente  = pat;
           marca= mar;
           modelo= mo;
           color = co;
           chofer= cho;
           estado= esta;
	}

}
