package jugadores.centrocampistas;

public class Pivote extends Centrocampista {
	
	private int intercepciones = 0;

	public Pivote(String nombre, int dorsal, int equipo, int pasesCompletados) {
		super(nombre, dorsal, equipo, pasesCompletados);
	}
	public Pivote(String nombre, int dorsal, int equipo, int pasesCompletados, int intercepciones) {
		super(nombre, dorsal, equipo, pasesCompletados);
	}

	public int getIntercepciones() {
		return intercepciones;
	}
	public void setIntercepciones(int intercepciones) {
		if(intercepciones < 0) {	
			throw new IllegalArgumentException("No puedes tener intercepciones negativas");
		}
		this.intercepciones = intercepciones;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Pivote [nombre: " + getNombre() + ", dorsal: " + getDorsal() + ", equipo: " + getEquipo() + ", pases completados: " + getPasesCompletados() + ", intercepciones: " + getIntercepciones() + "]";
	}
}
