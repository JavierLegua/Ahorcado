package Juego;

import java.util.Random;

public class Metodos {

	// Pinta el muñeco en pantalla dependiendo de las vidas
	public static void dibujarMuneco(int vidas) {
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
			System.out.println("|         | oo|");
			System.out.println("|         |__/| ");
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
			System.out.println("|        _|_");
			System.out.println("|        | oo|");
			System.out.println("|        |_ /| ");
			System.out.println("|          |");
			System.out.println("|          |");
			System.out.println("|          |");
			System.out.println("|          |");
			System.out.println("|			   		");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|______________");

			break;
		case 2:
			System.out.println("__________");
			System.out.println("|        _|_");
			System.out.println("|        | oo|");
			System.out.println("|        |_ /| ");
			System.out.println("|          |");
			System.out.println("|     -----|-----");
			System.out.println("|          |");
			System.out.println("|          |");
			System.out.println("|			   		");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|______________");

			break;
		case 1:
			System.out.println("__________");
			System.out.println("|        _|_");
			System.out.println("|        | xx|");
			System.out.println("|        |_ /| ");
			System.out.println("|          |");
			System.out.println("|     -----|-----");
			System.out.println("|          |");
			System.out.println("|          |");
			System.out.println("|        /   \\");
			System.out.println("|       /     \\");
			System.out.println("|      /       \\");
			System.out.println("|     /         \\");
			System.out.println("|______________");

			break;
		case 0:

			break;
		}
	}

	// Comprueba que una letra existe en la palabra.
	// Devuelve verdadero si se encuentra, falso en caso contrario
	public static boolean comprobarLetraPalabra(String vPalabraSecreta[], String letra) {
		boolean encontrado = false;

		return encontrado;
	}

	public static void inicializarVectores(String palabra, String vPalabraSecreta[], String vAciertos[],
			String vFallos[]) {
		for (int i = 0; i < vFallos.length; i++) {
			vFallos[i] = "_";
		}
		for (int i = 0; i < vPalabraSecreta.length; i++) {
			// Trocear la palabra en letras al vector
			vPalabraSecreta[i] = palabra.substring(i, i + 1);
			vAciertos[i] = "_";
		}

	}

	public static void dibujarAciertorErrores(String[] vFallos, String[] vAciertos) {

		// Imprimir los fallos
		System.out.println("Fallos cometidos:");
		for (int i = 0; i < vFallos.length; i++) {
			if (!vFallos[i].equals("_")) {
				System.out.print(vFallos[i] + " ");
			}
		}

		// System.out.println("");
		System.out.println("\n¡Palabra Secreta!");
		// Imprimir los aciertos
		for (int i = 0; i < vAciertos.length; i++) {
			System.out.print(vAciertos[i] + " ");
		}
		System.out.println("");
	}

	// Comprobar que la letra está en vPalabraSecreta
	// Si esta la guardo en vAciertos, sino la guardo en vFallos
	public static int comprobarLetraIntroducida(int vidas, String letra, String[] vPalabraSecreta, String[] vAciertos,
			String[] vFallos) {
		boolean encontrado = false;

		for (int i = 0; i < vPalabraSecreta.length; i++) {
			if (letra.equalsIgnoreCase(vPalabraSecreta[i])) {
				vAciertos[i] = letra;
				encontrado = true;
			}
		}

		if (encontrado == false) {
			for (int i = 0; i < vFallos.length; i++) {
				if (vFallos[i].equals("_")) {
					vFallos[i] = letra;
					vidas--;
					break;
				}
			}
		}

		return vidas;
	}

	// Cambio
	public static boolean heGanado(String vAciertos[]) {

		// boolean ganado = false;

		for (int i = 0; i < vAciertos.length; i++) {
			if (vAciertos[i].equals("_")) {
				return false;
				// ganado=false;
				// break;
			}
		}
		// return ganado;
		return true;
	}

	public static String generarPalabra() {
		String palabra;
		int num;
		String vPalabraSecreta[] = { "hola", "adios", "mañana", "ayer", "javier", "esternocleidomastoideo", "juanfran",
				"kacper", "informatica", "alloza" };
		Random r = new Random();
		num = r.nextInt(vPalabraSecreta.length);
		palabra = vPalabraSecreta[num];
		return palabra;
	}

	
}
