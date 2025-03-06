package jugadores;

import java.util.ArrayList;
import java.util.List;

public abstract class Jugador {
	
	private int idJugador;
	private String nombre;
	private int dorsal;
	private int equipo;
	
	private static int ultimoIdJugador = 0;
	private static List<Jugador> listaJugadores = new ArrayList<Jugador>();
	
	public Jugador(String nombre, int dorsal, int equipo) {
		this.idJugador = ++ultimoIdJugador;
		setNombre(nombre);
		setDorsal(dorsal);
		setEquipo(equipo);
		listaJugadores.add(this);
	}
	
	public static Jugador getJugadorPorId(int id) {
		Jugador devolver = null;
		boolean encontrado =false;
		for(Jugador elem : listaJugadores) {
			if(elem.getIdJugador() == id) {
				devolver = elem;
				encontrado = true;
			}
		}
		if(!encontrado) {
			throw new IllegalArgumentException("Jugador con ese id no encontrado");
		}
		return devolver;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("El nombre debe tener carácteres");
		}
		this.nombre = nombre;
	}
	
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		if(dorsal < 1 || dorsal > 99) {
			throw new IllegalArgumentException("El dorsal puede ser entre 1 y 99");
		}
		this.dorsal = dorsal;
	}
	
	public int getEquipo() {
		return equipo;
	}
	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}
	
	public int getIdJugador() {
		return this.idJugador;
	}
	
	public static List<Jugador> getLista(){
		return listaJugadores;
	}
	
	public abstract void mostrarDatos();
	
	@Override
	public String toString() {
		return "Jugador [nombre: " + getNombre() + ", dorsal: " + getDorsal() + ", equipo: " + getEquipo() + "]";
	}
	
	@Override
	public boolean equals(Object ob2) {
		Jugador j2 = (Jugador) ob2;
		boolean result = false;
		if(j2.getIdJugador() == this.getIdJugador()) {
			result = true;
		}
		return result;
	}
	
}
