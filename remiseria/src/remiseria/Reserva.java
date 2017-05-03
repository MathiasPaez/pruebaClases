package remiseria;

public class  Reserva extends Viaje 
{
	public Reserva(Direccion orig, Direccion dest, float cost, Chofer chof,
			Cliente client, FormaDePago formapag) {
		super(orig, dest, cost, chof, client, formapag);
		// TODO Auto-generated constructor stub
	}

	int fecha;
}
