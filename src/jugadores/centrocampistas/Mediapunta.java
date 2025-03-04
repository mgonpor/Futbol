package jugadores.centrocampistas;

public class Mediapunta extends Centrocampista {
	
	private int asistencias = 0;

	public Mediapunta(String nombre, int dorsal, int equipo, int pasesCompletados, int asistencias) {
		super(nombre, dorsal, equipo, pasesCompletados);
		setAsistencias(asistencias);
	}
	public Mediapunta(String nombre, int dorsal, int equipo, int pasesCompletados) {
		super(nombre, dorsal, equipo, pasesCompletados);
	}

	public int getAsistencias() {
		return asistencias;
	}
	public void setAsistencias(int asistencias) {
		if(asistencias < 0) {
			throw new IllegalArgumentException("No puedes tener asistencias negativas.");
		}
		this.asistencias = asistencias;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Mediapunta [nombre: " + getNombre() + ", dorsal: " + getDorsal() + ", equipo: " + getEquipo() + ", pases completados: " + getPasesCompletados() + ", asistencias: " + getAsistencias() + "]";
	}

}
