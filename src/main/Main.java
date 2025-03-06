package main;

import java.util.Scanner;

import equipo.Equipo;
import jugadores.Jugador;
import jugadores.Puesto;
import jugadores.centrocampistas.Mediapunta;
import jugadores.centrocampistas.Pivote;
import jugadores.defensas.Central;
import jugadores.defensas.Lateral;
import jugadores.delanteros.DelanteroCentro;
import jugadores.delanteros.Extremo;
import jugadores.porteros.Portero;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Equipo equipoA = new Equipo("Equipo A");
		Portero p = new Portero("Iker", 1, 1);// 1
		Portero ps = new Portero("Bounou", 13, 1);// 2
		Central c1 = new Central("Sergio Ramos", 2, 2, 13);// 3
		Central c2 = new Central("Puyol", 3,3, 20);// 4
		Central cs = new Central("Diego carlos", 22,2, 3);// 5
		Lateral li = new Lateral("Kounde", 4, 1, 24, Puesto.IZQUIERDO.toString());//6
		Lateral lis = new Lateral("Arnold", 21, 1, 24, Puesto.IZQUIERDO.toString());//7
		Lateral ld = new Lateral("Walker", 5, 1, 24, Puesto.DERECHO.toString());//8
		Lateral lds = new Lateral("Frimpong", 24, 1, 24, Puesto.DERECHO.toString());//9
		Pivote piv1 = new Pivote("Busquets", 6, 1, 200, 50);//10
		Pivote piv2 = new Pivote("Rodri", 7, 1, 120);//11
		Pivote pivs = new Pivote("Gudelj", 18, 1, 50);//12
		Mediapunta md = new Mediapunta("Odegaard", 8, 1, 300, 10);//13
		Mediapunta mds = new Mediapunta("Mount", 25, 1, 150, 3);//14
		Extremo ei = new Extremo("Cristiano Ronaldo", 11, 1, 24, Puesto.IZQUIERDO.toString());//15
		Extremo eis = new Extremo("Raphina", 14, 1, 24, Puesto.IZQUIERDO.toString());//16
		Extremo ed = new Extremo("Messi", 10, 1, 24, Puesto.DERECHO.toString());//17
		Extremo eds = new Extremo("Lamine yamal", 20, 1, 24, Puesto.DERECHO.toString());//18
		DelanteroCentro dc = new DelanteroCentro("Lewandowski", 9, 1, 12, 2);//19
		DelanteroCentro dcs = new DelanteroCentro("iago aspas", 15, 1, 12, 2);//20
		menu(sc, equipoA);
	}

	public static void menu(Scanner sc, Equipo equipoA) {
		
		int indice;
		do {
		System.out.println("\n\nMenu: "
				+ "\n1.Crear equipo e insertar jugadores "
				+ "\n2.Seleccion dinamica "
				+ "\n3.Mostrar alineación"
				+ "\n4.Salir"
				);
		indice = sc.nextInt();
		switch (indice) {
		case 1:
			System.out.println("\nCreamos un equipo e insertamos los jugadores: ");
			equipoA.addJugador(0, 1);
			equipoA.addJugador(1, 6);
			equipoA.addJugador(2, 3);
			equipoA.addJugador(3, 4);
			equipoA.addJugador(4, 8);
			equipoA.addJugador(5, 10);
			equipoA.addJugador(6, 11);
			equipoA.addJugador(7, 13);
			equipoA.addJugador(8, 15);
			equipoA.addJugador(9, 17);
			equipoA.addJugador(10, 19);
			equipoA.addJugador(10, 20);
			break;
		case 2:
			System.out.println("\nDemostración de la selección dinámica con el método mostrarDatos(): ");
			for(Jugador j : Jugador.getLista()) {
				j.mostrarDatos();
			}
			break;
		case 3:
			equipoA.mostrarAlineación();
			break;
		case 4:
			System.out.println("\nTerminado.... ");
			break;
		default:
			System.out.println("\nOpcion no valida ");
			break;
		}
		}while(indice != 4);
	}
}