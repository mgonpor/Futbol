package main;

import java.util.Scanner;

import equipo.Equipo;
import jugadores.Puesto;
import jugadores.centrocampistas.Mediapunta;
import jugadores.centrocampistas.Pivote;
import jugadores.defensas.Central;
import jugadores.defensas.Lateral;
import jugadores.delanteros.DelanteroCentro;
import jugadores.delanteros.Extremo;
import jugadores.porteros.Portero;

public class Main {
	private static Equipo equipoA;
	private static int indice;
	public static void main(String[] args) {
		Equipo equipoA = new Equipo("Equipo A");
		Portero p1 = new Portero("Iker", 1, 1);
		Portero ps1 = new Portero("Bounou", 13, 1);
		Central c1 = new Central("Sergio Ramos", 2, 2, 13);
		Central c2 = new Central("Puyol", 3,3, 20);
		Central cs1 = new Central("Diego carlos", 22,2, 3);
		Lateral li = new Lateral("Kounde", 4, 1, 24, Puesto.IZQUIERDO.toString());
		Lateral lis = new Lateral("", 4, 1, 24, Puesto.IZQUIERDO.toString());
		Lateral ld = new Lateral("", 4, 1, 24, Puesto.DERECHO.toString());
		Lateral lds = new Lateral("", 4, 1, 24, Puesto.DERECHO.toString());
		Pivote piv1 = new Pivote();
		Pivote piv2 = new Pivote();
		Pivote pivs = new Pivote();
		Mediapunta md = new Mediapunta();
		Mediapunta mds = new Mediapunta();
		Extremo ei = new Extremo("", 4, 1, 24, Puesto.IZQUIERDO.toString());
		Extremo eis = new Extremo("", 4, 1, 24, Puesto.IZQUIERDO.toString());
		Extremo ed = new Extremo("", 4, 1, 24, Puesto.DERECHO.toString());
		Extremo eds = new Extremo("", 4, 1, 24, Puesto.DERECHO.toString());
		DelanteroCentro dc = new DelanteroCentro("Lewandowski", 12, 1, 12, 2);
		DelanteroCentro dcs = new DelanteroCentro("iago aspas", 12, 1, 12, 2);

	}

	public static void menu(Scanner sc) {
		
		switch (indice) {
		case 1:
			System.out.println("\nCreamos un equipo e insertamos los jugadores: ");
			equipoA.addJugador(0, 1);
			equipoA.addJugador(1, 2);
			break;
		case 2:
			System.out.println("\nDemostración de la selección dinámica con el método mostrarDatos(): ");
			equipoA.mostrarAlineación();
			break;
		default:
			System.out.println("\nTerminado.... ");
			break;
		}
	}
}