package ejercicio_POO;

import java.util.Scanner;

public class ElectrodomesticosApp {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);
		String opciones = "";
		
		double precio = 100;
		char letra = 'F';
		int peso = 5;
		String color = "Blanco";
		
		Electrodomesticos electrodomestico1 = new Electrodomesticos();
		
		Electrodomesticos electrodomestico2 = new Electrodomesticos(precio, peso);
		
		Electrodomesticos electrodomestico3 = new Electrodomesticos(precio, letra, peso, color);
		
		Lavadoras lavadoras = new Lavadoras(precio, letra, peso, color, 38);

//		System.out.println(lavadoras);
		
		lavadoras.letra = datos.next().charAt(0);
		lavadoras.peso = datos.nextInt();
		
		electrodomestico3.setPeso(peso);
		lavadoras.color = datos.next();
		lavadoras.carga = datos.nextInt(); 
		lavadoras.precioFinal();
		System.out.println(lavadoras);
		
		
		System.exit(0);
		System.out.println("¿Lavadora o Televisión?");
		
		
		System.out.println("\nsimple \navanzada \ncancelar");
		
		System.out.println("Deseas obtener información: simple o avanzada");
		
		System.out.println("\nsimple \navanzada \ncancelar");

		opciones = datos.next();

		switch(opciones) {

		
		
		case "avanzada":
		case "Avanzada":
		case "AVANZADA":

			//set letra

			System.out.println("¿Nivel de ahorro energético?");
			System.out.println("Se encuentran estos niveles: \nA  \nB \nC \nD \nE \nF" );

			electrodomestico3.letra = datos.next().charAt(0);

			electrodomestico3.comprobarConsumoEnergetico(electrodomestico3.letra);

			//set peso

			System.out.println("¿Cual es su peso deseado?");


			try {

				peso = datos.nextInt();

				electrodomestico3.setPeso(peso);

			}catch(java.util.InputMismatchException e) {

				System.out.println("Información erroena");

				System.exit(0);

			}
			//set color

			System.out.println("¿Qué color quiere?");
			System.out.println("Disponemos de \nRojo \nNegro \nGris \nAzul \nBlanco");

			electrodomestico3.color = datos.next();

			electrodomestico3.comprobarColor(electrodomestico3.color);

			//toString

			System.out.println("Información facilitada");

			System.out.println(electrodomestico3);

			break;

		case "simple":
		case "Simple":
		case "SIMPLE":

			
			//consumo
			electrodomestico3.letra = ' '; 
			
			electrodomestico3.comprobarConsumoEnergetico(electrodomestico3.letra);
			//set peso

			System.out.println("¿Cual es su peso deseado?");


			try {

				peso = datos.nextInt();

				electrodomestico3.setPeso(peso);

			}catch(java.util.InputMismatchException e) {

				System.out.println("Información erroena");

				System.exit(0);


			}

			//toString

			System.out.println("Información facilitada");

			System.out.println(electrodomestico3);

			break;

		case "cancelar":
		case "Cancelar":
		case "CANCELAR":

			System.out.println("No ha facilitado información");
			break;

		default:

			System.out.println("Esa opcion no existe");
			break;

		}
	}
}