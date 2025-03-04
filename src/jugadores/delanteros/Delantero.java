package jugadores.delanteros;

import jugadores.Jugador;

public abstract class Delantero extends Jugador {
	
	private int goles = 0;

	public Delantero(String nombre, int dorsal, int equipo, int goles) {
		super(nombre, dorsal, equipo);
		setGoles(goles);
	}

	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		if(goles < 0) {
			throw new IllegalArgumentException("No puedes tener goles negativos");
		}
		this.goles = goles;
	}
	
	@Override
	public abstract void mostrarDatos();

	@Override
	public String toString() {
		return "Delantero [nombre: " + getNombre() + ", dorsal: " + getDorsal() + ", equipo: " + getEquipo() + ", goles: " + getGoles() + "]";
	}
	
}
