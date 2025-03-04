package jugadores.defensas;

import jugadores.Jugador;

public abstract class Defensa extends Jugador {

	private int disputasRealizadas = 0;
	
	public Defensa(String nombre, int dorsal, int equipo, int disputasRealizadas) {
		super(nombre, dorsal, equipo);
		setDisputasRealizadas(disputasRealizadas);
	}

	public int getDisputasRealizadas() {
		return disputasRealizadas;
	}
	public void setDisputasRealizadas(int disputasRealizadas) {
		if(disputasRealizadas < 0) {
			throw new IllegalArgumentException("No se pueden tener disputas negativas");
		}
		this.disputasRealizadas = disputasRealizadas;
	}
	
	@Override
	public abstract void mostrarDatos();

	@Override
	public String toString() {
		return "Defensa [nombre: "+ getNombre() + ", dorsal: " + getDorsal() + ", equipo: " + getEquipo() + ", disputas realizadas: " + getDisputasRealizadas() + "]";
	}
	
}
