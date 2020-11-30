package Juego;

import java.util.Random;
import java.util.Scanner;

public class JuegoAhorcado {

	public static void main(String[] args) {
		// Vidas totales 7
		Scanner leer = new Scanner(System.in);
		int vidas = 7;
		String palabraSecreta = Metodos.generarPalabra();
		String letra;
		String vAciertos[], vFallos[];
		String vPalabraSecreta[] = new String[palabraSecreta.length()];
		vAciertos = new String[palabraSecreta.length()];
		vFallos = new String[vidas + 1];
		Metodos.inicializarVectores(palabraSecreta, vPalabraSecreta, vAciertos, vFallos);
		// Estructura general del juego
		do {
			// 1º Preguntar letra
			System.out.println("Dime una letra");
			letra = leer.next();
			// 2º Comprobar si la letra está en la palabra
			vidas = Metodos.comprobarLetraIntroducida(vidas, letra, vPalabraSecreta, vAciertos, vFallos);

			// 3º Dibujar muñeco
			Metodos.dibujarMuneco(vidas);
			// 4º Dibujar aciertos y errores
			Metodos.dibujarAciertorErrores(vFallos, vAciertos);

		} while (vidas > 1 && Metodos.heGanado(vAciertos) == false);
		System.out.println("");
		if (vidas > 1)
			System.out.println("GANASTE!!!!!!");
		else
			System.out.println("Has perdido");
	}

}