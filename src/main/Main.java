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
		Lateral lis = new Lateral("Arnold", 21, 1, 24, Puesto.IZQUIERDO.toString());
		Lateral ld = new Lateral("Walker", 5, 1, 24, Puesto.DERECHO.toString());
		Lateral lds = new Lateral("Frimpong", 24, 1, 24, Puesto.DERECHO.toString());
		Pivote piv1 = new Pivote("Busquets", 6, 1, 200, 50);
		Pivote piv2 = new Pivote("Rodri", 7, 1, 120);
		Pivote pivs = new Pivote("Gudelj", 18, 1, 50);
		Mediapunta md = new Mediapunta("Odegaard", 8, 1, 300, 10);
		Mediapunta mds = new Mediapunta("Mount", 25, 1, 150, 3);
		Extremo ei = new Extremo("Cristiano Ronaldo", 11, 1, 24, Puesto.IZQUIERDO.toString());
		Extremo eis = new Extremo("Raphina", 14, 1, 24, Puesto.IZQUIERDO.toString());
		Extremo ed = new Extremo("Messi", 10, 1, 24, Puesto.DERECHO.toString());
		Extremo eds = new Extremo("Lamine yamal", 20, 1, 24, Puesto.DERECHO.toString());
		DelanteroCentro dc = new DelanteroCentro("Lewandowski", 9, 1, 12, 2);
		DelanteroCentro dcs = new DelanteroCentro("iago aspas", 15, 1, 12, 2);

	}

	public static void menu(Scanner sc) {
		System.out.println("\nMenu "
				+ "1.Crear equipo e insertar jugadores "
				+ "2.Seleccion dinamica "
				+ "3.Salir"
				);
		
		switch (indice) {
		case 1:
			System.out.println("\nCreamos un equipo e insertamos los jugadores: ");
			equipoA.addJugador(0, 1);
			equipoA.addJugador(1, 2);
			equipoA.addJugador(2, 3);
			equipoA.addJugador(3, 4);
			equipoA.addJugador(4, 5);
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