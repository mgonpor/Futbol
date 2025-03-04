package jugadores;

public abstract class Jugador {
	
	private int idJugador;
	private String nombre;
	private int dorsal;
	private int equipo;
	
	private static int ultimoIdJugador = 1;
	
	public Jugador(String nombre, int dorsal, int equipo) {
		this.idJugador = ultimoIdJugador ++;
		setNombre(nombre);
		setDorsal(dorsal);
		setEquipo(equipo);
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
		return idJugador;
	}
	
	public abstract void mostrarDatos();
}
