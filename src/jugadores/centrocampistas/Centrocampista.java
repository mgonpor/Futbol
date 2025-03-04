package jugadores.centrocampistas;

import jugadores.Jugador;

public abstract class Centrocampista extends Jugador {
	
	private int pasesCompletados = 0;

	public Centrocampista(String nombre, int dorsal, int equipo, int pasesCompletados) {
		super(nombre, dorsal, equipo);
		setPasesCompletados(pasesCompletados);
	}

	public int getPasesCompletados() {
		return pasesCompletados;
	}

	public void setPasesCompletados(int pasesCompletados) {
		if(pasesCompletados < 0) {
			throw new IllegalArgumentException("No puedes tener pases completados negativos");
		}
		this.pasesCompletados = pasesCompletados;
	}

	@Override
	public abstract void mostrarDatos();
	
	@Override
	public String toString() {
		return "Centrocampista [nombre: " + getNombre() + ", dorsal: " + getDorsal() + ", equipo: " + getEquipo() + ", pases completados: " + getPasesCompletados() + "]";
	}
	
}
