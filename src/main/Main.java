package main;

import java.util.Scanner;

import equipo.Equipo;
import jugadores.delanteros.DelanteroCentro;
import jugadores.porteros.Portero;

public class Main {
	private Equipo equipoA;
	private Portero portero;
	private static int indice;
	public static void main(String[] args) {
		Portero p1 = new Portero("Iker", 1, 1);
		Portero ps1 = new Portero("Bounou", 13, 1);
		
		DelanteroCentro d1 = new DelanteroCentro("pepe", 12, 1, 12, 2);
	}

	public static void menu(Scanner sc) {
		
		switch (indice) {
		case 1:
			System.out.println("\nCreamos un equipo e insertamos los jugadores: ");
			Equipo equipoA = new Equipo("Equipo A");
			equipoA.addJugador(0, 1);
			
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