package equipo;

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

	private int[] arrayJugadores;
	
	public Equipo() {
		this.arrayJugadores = new int[11];
	}
	
	public boolean addJugador(int pos, Jugador j) {
		boolean result = false;
		switch(pos) {
			case 0: 
				if(Portero.class == j.getClass()) {
					this.arrayJugadores[0] = ((Portero) j).getIdJugador();
					result = true;
				}else {
					System.out.println("\nEste jugador no es Portero, no puede ir en la posición 0.");
				}
				break;
			case 1: 
				if(Lateral.class == j.getClass()) {
					if(((Lateral) j).getPuesto() != Puesto.IZQUIERDO.toString()) {
						this.arrayJugadores[1] = ((Lateral) j).getIdJugador();
						result = true;
					}else {
						System.out.println("\nEste lateral no es IZQUIERDO, no puede ir en la posición 1, sino en la 4.");
					}
				}else {
					System.out.println("\nEste jugador no es Lateral, no puede ir en la posición 1 ni 4.");
				}
				break;
			case 2: 
				if(Central.class == j.getClass()) {
					this.arrayJugadores[2] = ((Central) j).getIdJugador();
					result = true;
				}else {
					System.out.println("\nEste jugador no es Central, no puede ir en la posición 2 ni 3.");
				}
				break;
			case 3: 
				if(Central.class == j.getClass()) {
					this.arrayJugadores[3] = ((Central) j).getIdJugador();
					result = true;
				}else {
					System.out.println("\nEste jugador no es Central, no puede ir en la posición 2 ni 3.");
				}
				break;
			case 4: 
				if(Lateral.class == j.getClass()) {
					if(((Lateral) j).getPuesto() != Puesto.DERECHO.toString()) {
						this.arrayJugadores[4] = ((Lateral) j).getIdJugador();
						result = true;
					}else {
						System.out.println("\nEste lateral no es DERECHO, no puede ir en la posición 4, sino en la 1.");
					}
				}else {
					System.out.println("\nEste jugador no es Lateral, no puede ir en la posición 1 ni 4.");
				}
				break;
			case 5: 
				if(Pivote.class == j.getClass()) {
					this.arrayJugadores[5] = ((Pivote) j).getIdJugador();
					result = true;
				}else {
					System.out.println("\nEste jugador no es Pivote, no puede ir en la posición 5 ni 6.");
				}
				break;
			case 6: 
				if(Pivote.class == j.getClass()) {
					this.arrayJugadores[6] = ((Pivote) j).getIdJugador();
					result = true;
				}else {
					System.out.println("\nEste jugador no es Pivote, no puede ir en la posición 5 ni 6.");
				}
				break;
			case 7: 
				if(Mediapunta.class == j.getClass()) {
					this.arrayJugadores[7] = ((Mediapunta) j).getIdJugador();
					result = true;
				}else {
					System.out.println("\nEste jugador no es Mediapunta, no puede ir en la posición 7.");
				}
				break;
			case 8: 
				if(Extremo.class == j.getClass()) {
					if(((Extremo) j).getPuesto() != Puesto.IZQUIERDO.toString()) {
						this.arrayJugadores[8] = ((Extremo) j).getIdJugador();
						result = true;
					}else {
						System.out.println("\nEste extremo no es IZQUIERDO, no puede ir en la posición 8, sino en la 9.");
					}
				}else {
					System.out.println("\nEste jugador no es Extremo, no puede ir en la posición 8 ni 9.");
				}
				break;
			case 9: 
				if(Extremo.class == j.getClass()) {
					if(((Extremo) j).getPuesto() != Puesto.DERECHO.toString()) {
						this.arrayJugadores[9] = ((Extremo) j).getIdJugador();
						result = true;
					}else {
						System.out.println("\nEste extremo no es DERECHO, no puede ir en la posición 9, sino en la 8.");
					}
				}else {
					System.out.println("\nEste jugador no es Extremo, no puede ir en la posición 8 ni 9.");
				}
				break;
			case 10: 
				if(DelanteroCentro.class == j.getClass()) {
					this.arrayJugadores[10] = ((DelanteroCentro) j).getIdJugador();
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
}
