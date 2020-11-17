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
	//Comprueba que una letra existe en la palabra.
		//Devuelve verdadero si se encuentra, falso en caso contrario
		public static boolean comprobarLetraPalabra(String vPalabraSecreta[], String letra) {
			boolean encontrado=false;
			
			return encontrado;
		}
		
		public static void inicializarVectores(String palabra, String vPalabraSecreta[], String vAciertos[],String vFallos[]) {
			for (int i = 0; i < vFallos.length; i++) {
				vFallos[i] = "_ ";
			}
			for (int i = 0; i < vPalabraSecreta.length; i++) {
				//Trocear la palabra en letras al vector
				
				vAciertos[i] = "_ ";
			}
		}
		
		public static void dibujarAciertorErrores(String[] vFallos, String[] vAciertos) {
			
			//Imprimir los fallos
			System.out.println("Fallos cometidos:");
			for (int i = 0; i < vFallos.length; i++) {
				if (!vFallos[i].equals("_")) {
					System.out.print(vFallos[i] + " ");
				}
			}
			
			//System.out.println("");
			System.out.println("\n¡Palabra Secreta!");
			//Imprimir los aciertos
			for (int i = 0; i < vAciertos.length; i++) {
				System.out.print(vAciertos[i]+ " ");
			}
		}
		
		//Comprobar que la letra está en vPalabraSecreta
		//Si esta la guardo en vAciertos, sino la guardo en vFallos
		public static int comprobarLetraIntroducida(int vidas, String letra, String[] vPalabraSecreta, String[] vAciertos,
				String[] vFallos) {
			// TODO Auto-generated method stub
			return vidas;
		}

	public static void main(String[] args) {

		// vidas totales 7
		Scanner leer = new Scanner(System.in);
		int vidas = 8;
		String palabraSecreta = "Juan";
		String letra;
		String vPalabraSecreta[], vAciertos[], vFallos[];
		vPalabraSecreta = new String[palabraSecreta.length()];
		vAciertos = new String[palabraSecreta.length()];
		vFallos = new String[vidas];
		inicializarVectores(palabraSecreta, vPalabraSecreta, vAciertos, vFallos);
		//Estructura general del juego
		do {
			//1º Preguntar letra
			System.out.println("Dime una letra");
			letra = leer.next();
			//2º Comprobar si la letra está en la palabra
			
			//3º Dibujar muñeco
			dibujarPalitrokes(vidas);
			//4º Dibujar aciertos y errores
			vidas--;
		}while(vidas>=0);
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