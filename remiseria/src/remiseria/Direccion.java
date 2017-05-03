package remiseria;

public class Direccion {
	String Localidad;
	int NroCalle;
	int NroEdificio;
	int NroTimbre;
	String Partido;
	int NroDepartamento;

	public Direccion(String loc, int Calle, int Edificio, int Timbre,
			String Partid, int Departamento) {
		Localidad = loc;
		NroCalle = Calle;
		NroEdificio = Edificio;
		NroTimbre = Timbre;
		Partido = Partid;
		NroDepartamento = Departamento;

	}

}
