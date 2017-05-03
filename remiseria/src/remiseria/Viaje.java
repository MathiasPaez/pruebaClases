package remiseria;

public class Viaje {
	Direccion origen;
	Direccion destino;
	float costo;
	Chofer chofer;
	Cliente cliente;
	FormaDePago formapago;

	public Viaje(Direccion orig, Direccion dest, float cost, Chofer chof,
			Cliente client, FormaDePago formapag) {
		
		origen = orig;
		destino = dest;
		costo = cost;
		chofer = chof;
		cliente = client;
		formapago = formapag;
	}

}
