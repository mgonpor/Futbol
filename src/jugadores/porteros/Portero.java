package jugadores.porteros;

import jugadores.Jugador;

public class Portero extends Jugador {
	
	private int paradas = 0;

	public Portero(String nombre, int dorsal, int equipo) {
		super(nombre, dorsal, equipo);
	}
	public Portero(String nombre, int dorsal, int equipo, int paradas) {
		super(nombre, dorsal, equipo);
		setParadas(paradas);
	}

	public int getParadas() {
		return paradas;
	}
	public void setParadas(int paradas) {
		if(paradas < 0) {
			throw new IllegalArgumentException("No se pueden tener paradas negativas.");
		}
		this.paradas = paradas;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());		
	}

	@Override
	public String toString() {
		return "Portero [nombre: "+ getNombre() + ", dorsal: " + getDorsal() + ", equipo: " + getEquipo() + ", paradas: " + getParadas() + "]";
	}
	
}
