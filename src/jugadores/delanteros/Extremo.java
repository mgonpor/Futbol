package jugadores.delanteros;

import jugadores.Puesto;

public class Extremo extends Delantero {
	
	private Puesto puesto;

	public Extremo(String nombre, int dorsal, int equipo, int goles, String puesto) {
		super(nombre, dorsal, equipo, goles);
		setPuesto(puesto);
	}

	public String getPuesto() {
		return this.puesto.toString();
	}
	public void setPuesto(String puesto) {
		this.puesto = Puesto.valueOf(puesto);
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Delantero Centro [nombre: " + getNombre() + ", dorsal: " + getDorsal() + ", equipo: " + getEquipo() + ", goles: " + getGoles() + ", puesto: " + getPuesto().toLowerCase() + "]";
	}

}
