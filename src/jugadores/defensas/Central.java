package jugadores.defensas;

public class Central extends Defensa {
	
	private int entradas = 0;

	public Central(String nombre, int dorsal, int equipo, int disputasRealizadas, int entradas) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		setEntradas(entradas);
	}
	public Central(String nombre, int dorsal, int equipo, int disputasRealizadas) {
		super(nombre, dorsal, equipo, disputasRealizadas);
	}

	public int getEntradas() {
		return entradas;
	}

	public void setEntradas(int entradas) {
		if(entradas < 0) {
			throw new IllegalArgumentException("Las entradas no pueden ser negativas.");
		}
		this.entradas = entradas;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Central [nombre: "+ getNombre() + ", dorsal: " + getDorsal() + ", equipo: " + getEquipo() + ", disputas realizadas: " + getDisputasRealizadas() + ", entradas: " + getEntradas() + "]";
	}
	
}
