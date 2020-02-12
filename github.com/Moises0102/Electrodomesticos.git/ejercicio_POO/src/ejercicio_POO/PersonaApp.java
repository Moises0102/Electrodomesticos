package ejercicio_POO;

import java.util.Scanner;

public class PersonaApp {

	public static void main(String[] args) {

		//		Ahora, crea una clase ejecutable que haga lo siguiente:
		//		
		//				�       Pide por teclado el nombre, la edad, sexo, peso y altura.
		//		
		//				�       Crea 3 objetos de la clase anterior, el primer objeto obtendr� las anteriores variables pedidas por teclado, el segundo objeto
		//				obtendr� todos los anteriores menos el peso y la altura y el �ltimo por defecto, para este �ltimo utiliza los m�todos set para darle a
		//				los atributos un valor.
		//		
		//				�       Para cada objeto, deber� comprobar si est� en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
		//		
		//				�       Indicar para cada objeto si es mayor de edad.
		//		
		//				�       Por �ltimo, mostrar la informaci�n de cada objeto.
		//		
		//				Puedes usar m�todos en la clase ejecutable.    

		Scanner prueba = new Scanner(System.in);

		int edad = 0;

		String nombre = "";

		char sexo = ' ';

		double peso = 0;

		double altura = 0;

		String dni = Persona.generarDNI();

		String opciones = "";

		Persona persona = new Persona();

		Persona persona2 = new Persona(nombre, edad, sexo);

		Persona persona3 = new Persona(nombre, edad, sexo, dni, peso, altura);

		System.out.println("Desea dar informacion de forma simple o avanzada, o no desea dar informacion");
		
		System.out.println();
		
		System.out.println("Avanzada \tSimple \t\tCancelar");

		opciones = prueba.next();

		switch (opciones) {

		case "avanzada":
		case "Avanzada":

			//setNombre

			System.out.println("�Cual es su nombre?");

//			prueba.next();
			
			nombre = prueba.next();

			persona3.setNombre(nombre);



			//setEdad

			try {

				System.out.println("�Qu� edad tienes?");

//				prueba.next();
				
				edad = prueba.nextInt();

				persona3.setEdad(edad);

			}catch (java.util.InputMismatchException e){

				System.out.println("Informaci�n erronea");

				persona3.setEdad(edad);
			}



			//setSexo

			System.out.println("�Eres hombre o mujer?");

//			prueba.next();
			
			sexo = prueba.next().charAt(0);

			persona3.setSexo(sexo);



			//setAltura

			System.out.println("�Cuanto mide?");

			try {
				
//				prueba.next();
				
				altura = prueba.nextDouble();

				persona3.setAltura(altura);

			}catch (java.util.InputMismatchException e){

				System.out.println("Informaci�n erronea");

				System.exit(0);

			}

				//setPeso

				System.out.println("�Cuanto pesa?");

				try {
					
//					prueba.next();
					
					peso = prueba.nextDouble();

					persona3.setPeso(peso);

				}catch (java.util.InputMismatchException e){

					System.out.println("Informaci�n erronea");

					System.exit(0);

				}


				//toString

				System.out.println("Esta es la informaci�n que nos ha facilitado");

				System.out.println(persona3);

				break;
				
				

				
				
			case "simple":

				//setNombre

				System.out.println("�Cual es su nombre?");

				nombre = prueba.next();

				persona2.setNombre(nombre);



				//setEdad

				try {

					System.out.println("�Qu� edad tienes?");

					edad = prueba.nextInt();

					persona2.setEdad(edad);

				}catch (java.util.InputMismatchException e){

					System.out.println("Informaci�n erronea");

					System.exit(0);
				}



				//setSexo

				System.out.println("�Eres hombre o mujer?");

				sexo = prueba.next().charAt(0);

				persona2.setSexo(sexo);


				System.out.println("Esta es la informaci�n que nos ha facilitado");

				System.out.println(persona2);

				break;

			case "cancelar":
				System.out.println("No nos ha facilitado ninguna informacion");


				break;

			default:

				System.out.println("Esa opcion no existe");

			}





		}


	}
