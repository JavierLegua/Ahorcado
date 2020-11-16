import java.util.Scanner;
public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

		double npractica,nproblemas,nteorica,media;
		String nombre;
		System.out.println("Escribeme el nombre del alumno a calificar:(si no escribes nada el proceso finalizará)");
		nombre = leer .nextLine();
		while (nombre != "") {
		
		System.out.println("Escribeme la nota de las Practicas");
		npractica = leer .nextInt();
		
		System.out.println("Escribeme la nota de los Problemas");
		nproblemas = leer .nextInt();
		
		System.out.println("Por ultimo escribeme la nota de la Teoria");
		nteorica = leer .nextInt();
		
		if((npractica <= 10 || npractica >=0) || (nteorica <= 10 || nteorica >= 0) || (nproblemas <= 10 || nproblemas >= 10)) {
			System.out.println("El nombre del alumno calificado es " + nombre);
			
			System.out.println("La nota de la teoria es un " + nteorica);
			
			System.out.println("La nota de los problemas es un " + nproblemas);
			
			System.out.println("La nota de la práctica es un " + npractica);
			
			npractica = npractica * 0.1;
					
			nproblemas = nproblemas * 0.5;
			
			nteorica = nteorica * 0.4;
			
			media = npractica + nproblemas + nteorica;  
			
			System.out.println("Y la nota final de la evaluacion es:" + media);
			
			
		}else {
			System.out.println("Las notas son incorrectas,empieza de nuevo");
		}
		
		System.out.println("Escribe el nombre de otro alumno");
		
		nombre = leer .nextLine();
		
		}
		
		
		
	}

}
