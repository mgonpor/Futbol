package jugadores.defensas;

import jugadores.Puesto;

public class Lateral extends Defensa {
	
	private Puesto puesto;

	public Lateral(String nombre, int dorsal, int equipo, int disputasRealizadas, String puesto) {
		super(nombre, dorsal, equipo, disputasRealizadas);
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
		return "Lateral [nombre: "+ getNombre() + ", dorsal: " + getDorsal() + ", equipo: " + getEquipo() + ", disputas realizadas: " + getDisputasRealizadas() + ", puesto: " + getPuesto().toLowerCase() + "]";
	}


}
