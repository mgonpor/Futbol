package jugadores.delanteros;

public class DelanteroCentro extends Delantero {
	
	private int golesDePenalti = 0;

	public DelanteroCentro(String nombre, int dorsal, int equipo, int goles) {
		super(nombre, dorsal, equipo, goles);
	}
	public DelanteroCentro(String nombre, int dorsal, int equipo, int goles, int golesDePenalti) {
		super(nombre, dorsal, equipo, goles);
		setGolesDePenalti(golesDePenalti);
	}
	
	public int getGolesDePenalti() {
		return golesDePenalti;
	}
	public void setGolesDePenalti(int golesDePenalti) {
		if(golesDePenalti < 0) {
			throw new IllegalArgumentException("No puedes tener goles negativos");
		}
		this.golesDePenalti = golesDePenalti;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Delantero Centro [nombre: " + getNombre() + ", dorsal: " + getDorsal() + ", equipo: " + getEquipo() + ", goles: " + getGoles() + ", goles de penalti: " + getGolesDePenalti() + "]";
	}
}
