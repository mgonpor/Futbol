package main;

import java.util.Scanner;

import jugadores.delanteros.DelanteroCentro;

public class Main {

	public static void main(String[] args) {
		DelanteroCentro d1 = new DelanteroCentro("pepe", 12, 1, 12, 2);
		DelanteroCentro d2 = d1;
		System.out.println(d1.equals(d2));
	}

	public static void menu(Scanner sc) {
		System.out.println("\nCreamos un equipo e insertamos los jugadores: ");
		

		System.out.println("\nDemostración de la selección dinámica con el método mostrarDatos(): ");
		
	}
	
}
