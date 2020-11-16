package Juego;

import java.util.Scanner;

public class JuegoAhorcado {

	public static void dibujarPalitrokes(int vidas) {
		switch (vidas) {
		case 7:
			System.out.println("");
			break;
		case 6:
			System.out.println("______________________");

			break;
		case 5:
			System.out.println("___________");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|______________________");

			break;
		case 4:
			System.out.println("___________");
			System.out.println("|          _|_");
			System.out.println("|         |   |");
			System.out.println("|         |_ _| ");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|______________");

			break;
		case 3:
			System.out.println("__________");
			System.out.println("|         _|_");
			System.out.println("|        |   |");
			System.out.println("|        |_ _| ");
			System.out.println("|          |");
			System.out.println("|          |");
			System.out.println("|		   |");
			System.out.println("|		   |");
			System.out.println("|			   		");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|______________");

			break;
		case 2:
			System.out.println("_______________");
			System.out.println("|              _|_");
			System.out.println("|             |   |");
			System.out.println("|             |_ _| ");
			System.out.println("|               |");
			System.out.println("|         ______|______");
			System.out.println("|				|");
			System.out.println("|				|");
			System.out.println("|			   		");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|______________");

			break;
		case 1:
			System.out.println("_______________");
			System.out.println("|              _|_");
			System.out.println("|             |   |");
			System.out.println("|             |_ _| ");
			System.out.println("|               |");
			System.out.println("|         ______|_____");
			System.out.println("|				|");
			System.out.println("|			    |");
			System.out.println("|			   /| 	");
			System.out.println("|             / |  ");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|_____________________________");

			break;
		case 0:

			break;

		}
	}

	public static void main(String[] args) {

		// vidas totales 7
		Scanner leer = new Scanner(System.in);
		int vidas = 8;
		String palabraSecreta = "Juan";

		// estructura general
		do {
			// preguntar letra
			// comparar letra con palabra
			dibujarPalitrokes(vidas);
			// dibujar aciertos y errores
			vidas--;

		} while (vidas >= 0);
	}
}
