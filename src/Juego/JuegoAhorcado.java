package Juego;

import java.util.Random;
import java.util.Scanner;

public class JuegoAhorcado {

	public static void main(String[] args) {
		// Vidas totales 7
		Scanner leer = new Scanner(System.in);
		int vidas = 7;
		String palabraSecreta = metodos.generarPalabra();
		String letra;
		String vAciertos[], vFallos[];
		String vPalabraSecreta[] = new String[palabraSecreta.length()];
		vAciertos = new String[palabraSecreta.length()];
		vFallos = new String[vidas + 1];
		metodos.inicializarVectores(palabraSecreta, vPalabraSecreta, vAciertos, vFallos);
		// Estructura general del juego
		do {
			// 1º Preguntar letra
			System.out.println("Dime una letra");
			letra = leer.next();
			// 2º Comprobar si la letra está en la palabra
			vidas = metodos.comprobarLetraIntroducida(vidas, letra, vPalabraSecreta, vAciertos, vFallos);

			// 3º Dibujar muñeco
			metodos.dibujarMuneco(vidas);
			// 4º Dibujar aciertos y errores
			metodos.dibujarAciertorErrores(vFallos, vAciertos);

		} while (vidas > 1 && metodos.heGanado(vAciertos) == false);
		System.out.println("");
		if (vidas > 1)
			System.out.println("GANASTE!!!!!!");
		else
			System.out.println("Has perdido");
	}

}