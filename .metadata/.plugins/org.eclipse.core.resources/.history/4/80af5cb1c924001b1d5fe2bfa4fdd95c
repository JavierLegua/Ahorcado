import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int nums,cont,suma,minimo,maximo;
		float media=0;
		
		
		
		
		System.out.println("Escribe numeros, y te mostrare el minimo,el máximo, y la media de todos ellos.(Para finalizar el programa escribe 0");
		nums = leer .nextInt();
		
		cont = 0;
		minimo = nums;
		maximo = nums;
		media = nums;
		suma = 0;
		
		while (nums > 0 ) {
		
		if(nums > maximo) {
			maximo = nums;
		}
		if(nums < minimo) {
			minimo = nums;
		}
		suma = suma + nums;
		cont ++;
		System.out.println("Escribe otro numero");
		nums = leer .nextInt();

		}
		media = suma/(cont);
		System.out.println("El numero maximo es el " + maximo);
		System.out.println("El numero minimo es el " + minimo);
		System.out.println("La media de los numeros es " + media);
	}

}
