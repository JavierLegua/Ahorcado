package Ahorcado;

public class JuegoAhorcado {

	public static void dibujarPalitrokes(int vidas) {
		switch (vidas) {
		case 7:
			System.out.println("______________________");
			break;
		case 6:

			break;
		case 5:

			break;
		case 4:

			break;
		case 3:

			break;
		case 2:

			break;
		case 1:

			break;
		case 0:

			break;
		}
	}

	public static void main(String[] args) {
		
		//vidas totales 7
		int vidas=8;
		
		//estructura general
		do {
			//preguntar letra
			//comparar letra con palabra
			dibujarPalitrokes(vidas);
			//dibujar aciertos y errores
			vidas--;

		}while(vidas>=0);
	}
}
