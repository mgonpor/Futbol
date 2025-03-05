package equipo;

import java.util.ArrayList;
import jugadores.Jugador;
import jugadores.Puesto;
import jugadores.centrocampistas.Mediapunta;
import jugadores.centrocampistas.Pivote;
import jugadores.defensas.Central;
import jugadores.defensas.Lateral;
import jugadores.delanteros.DelanteroCentro;
import jugadores.delanteros.Extremo;
import jugadores.porteros.Portero;

public class Equipo {

	private int idEquipo;
	private String nombreEquipo;
	private Jugador[] arrayJugadores;
	
	private static int ultimoIdEquipo = 1;
	
	public Equipo() {
		this.idEquipo = ultimoIdEquipo ++;
		setNombreEquipo("Equipo"+this.idEquipo);
		this.arrayJugadores = new Jugador[11];
	}
	public Equipo(String nombreEquipo) {
		this.idEquipo = ultimoIdEquipo ++;
		setNombreEquipo(nombreEquipo);
		this.arrayJugadores = new Jugador[11];
	}
	
	public int getIdEquipo() {
		return this.idEquipo;
	}
	
	public String getNombreEquipo() {
		return this.nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	public boolean addJugador(int pos, int id) {
		boolean result = false;
		switch(pos) {
			case 0: 
				if(Portero.class == Jugador.getJugadorPorId(id).getClass()) {	// Jugador.getJugadorPorId(id).instanceOf(Portero)
					this.arrayJugadores[0] = Jugador.getJugadorPorId(id);
					result = true;
				}else {
					System.out.println("\nEste jugador no es Portero, no puede ir en la posición 0.");
				}
				break;
			case 1: 
				if(Lateral.class == Jugador.getJugadorPorId(id).getClass()) {
					if(((Lateral)Jugador.getJugadorPorId(id)).getPuesto() != Puesto.IZQUIERDO.toString()) {
						this.arrayJugadores[1] = Jugador.getJugadorPorId(id);
						result = true;
					}else {
						System.out.println("\nEste lateral no es IZQUIERDO, no puede ir en la posición 1, sino en la 4.");
					}
				}else {
					System.out.println("\nEste jugador no es Lateral, no puede ir en la posición 1 ni 4.");
				}
				break;
			case 2: 
				if(Central.class == Jugador.getJugadorPorId(id).getClass()) {
					this.arrayJugadores[2] = Jugador.getJugadorPorId(id);
					result = true;
				}else {
					System.out.println("\nEste jugador no es Central, no puede ir en la posición 2 ni 3.");
				}
				break;
			case 3: 
				if(Central.class == Jugador.getJugadorPorId(id).getClass()) {
					this.arrayJugadores[3] = Jugador.getJugadorPorId(id);
					result = true;
				}else {
					System.out.println("\nEste jugador no es Central, no puede ir en la posición 2 ni 3.");
				}
				break;
			case 4: 
				if(Lateral.class == Jugador.getJugadorPorId(id).getClass()) {
					if(((Lateral) Jugador.getJugadorPorId(id)).getPuesto() != Puesto.DERECHO.toString()) {
						this.arrayJugadores[4] = Jugador.getJugadorPorId(id);
						result = true;
					}else {
						System.out.println("\nEste lateral no es DERECHO, no puede ir en la posición 4, sino en la 1.");
					}
				}else {
					System.out.println("\nEste jugador no es Lateral, no puede ir en la posición 1 ni 4.");
				}
				break;
			case 5: 
				if(Pivote.class == Jugador.getJugadorPorId(id).getClass()) {
					this.arrayJugadores[5] = Jugador.getJugadorPorId(id);
					result = true;
				}else {
					System.out.println("\nEste jugador no es Pivote, no puede ir en la posición 5 ni 6.");
				}
				break;
			case 6: 
				if(Pivote.class == Jugador.getJugadorPorId(id).getClass()) {
					this.arrayJugadores[6] = Jugador.getJugadorPorId(id);
					result = true;
				}else {
					System.out.println("\nEste jugador no es Pivote, no puede ir en la posición 5 ni 6.");
				}
				break;
			case 7: 
				if(Mediapunta.class == Jugador.getJugadorPorId(id).getClass()) {
					this.arrayJugadores[7] = Jugador.getJugadorPorId(id);
					result = true;
				}else {
					System.out.println("\nEste jugador no es Mediapunta, no puede ir en la posición 7.");
				}
				break;
			case 8: 
				if(Extremo.class == Jugador.getJugadorPorId(id).getClass()) {
					if(((Extremo) Jugador.getJugadorPorId(id)).getPuesto() != Puesto.IZQUIERDO.toString()) {
						this.arrayJugadores[8] = Jugador.getJugadorPorId(id);
						result = true;
					}else {
						System.out.println("\nEste extremo no es IZQUIERDO, no puede ir en la posición 8, sino en la 9.");
					}
				}else {
					System.out.println("\nEste jugador no es Extremo, no puede ir en la posición 8 ni 9.");
				}
				break;
			case 9: 
				if(Extremo.class == Jugador.getJugadorPorId(id).getClass()) {
					if(((Extremo) Jugador.getJugadorPorId(id)).getPuesto() != Puesto.DERECHO.toString()) {
						this.arrayJugadores[9] = Jugador.getJugadorPorId(id);
						result = true;
					}else {
						System.out.println("\nEste extremo no es DERECHO, no puede ir en la posición 9, sino en la 8.");
					}
				}else {
					System.out.println("\nEste jugador no es Extremo, no puede ir en la posición 8 ni 9.");
				}
				break;
			case 10: 
				if(DelanteroCentro.class == Jugador.getJugadorPorId(id).getClass()) {
					this.arrayJugadores[10] = Jugador.getJugadorPorId(id);
					result = true;
				}else {
					System.out.println("\nEste jugador no es Delantero Centro, no puede ir en la posición 10.");
				}
				break;
			default:
				System.out.println("\nEsa posición no existe, van de 0 a 10.");
		}
		return result;
	}
	
	public void mostrarAlineación() {
		boolean alineacionCompleta = false;
		ArrayList<Integer> faltan = new ArrayList<Integer>();
		for(int i=0; i<11; i++) {
			if(this.arrayJugadores[i] == null) { 
				alineacionCompleta = true;
				faltan.add((Integer) i);
			}
		}
		
		if(alineacionCompleta) {
			System.out.println("\nLa alineación está incompleta, faltan las posiciones " + faltan.toString());
		}else {
			System.out.println("\n    ALINEACIÓN:");
			System.out.printf("\n0. Portero: %s - %d", this.arrayJugadores[0].getNombre(), this.arrayJugadores[0].getDorsal());
			System.out.printf("\n1. Lateral izquierdo: %s - %d", this.arrayJugadores[1].getNombre(), this.arrayJugadores[1].getDorsal());
			System.out.printf("\n2,3. Centrales: %s - %d | %s - %d", this.arrayJugadores[2].getNombre(), this.arrayJugadores[2].getDorsal(), this.arrayJugadores[3].getNombre(), this.arrayJugadores[3].getDorsal());
			System.out.printf("\n4. Lateral derecho: %s - %d", this.arrayJugadores[4].getNombre(), this.arrayJugadores[4].getDorsal());
			System.out.printf("\n5,6. Pivotes: %s - %d | %s - %d", this.arrayJugadores[5].getNombre(), this.arrayJugadores[5].getDorsal(), this.arrayJugadores[6].getNombre(), this.arrayJugadores[6].getDorsal());
			System.out.printf("\n7. Mediapunta: %s - %d", this.arrayJugadores[7].getNombre(), this.arrayJugadores[7].getDorsal());
			System.out.printf("\n8. Extremo izquierdo: %s - %d", this.arrayJugadores[8].getNombre(), this.arrayJugadores[8].getDorsal());
			System.out.printf("\n9. Extremo derecho: %s - %d", this.arrayJugadores[9].getNombre(), this.arrayJugadores[9].getDorsal());
			System.out.printf("\n10. Delantero centro: %s - %d", this.arrayJugadores[10].getNombre(), this.arrayJugadores[10].getDorsal());
		}
	}
}
