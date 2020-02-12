package Escuela;

import java.util.Scanner;

public class Clase {

	public static void main(String[] args) {
		
		
		Scanner darDatos = new Scanner (System.in);

		String nombre = "";

		String apellidos = "";

		int ID = 0;

		char grupo = ' ';

		int curso = 0; 

		String dia = "";
		String mes = "";
		String año = "";

		String fechaDeNacimiento = "";


		Alumno alumno = new Alumno(nombre, apellidos, ID, grupo, curso, fechaDeNacimiento);
		
		
		System.out.println("Ingrese su nombre");

		nombre = darDatos.next();
		
		alumno.setNombre(nombre);

		System.out.println("Ahora sus apellidos");

		apellidos = darDatos.next();
		
		alumno.setApellidos(apellidos);
		

		System.out.println("Ingrese su fecha de cumpleaños");

		System.out.println("¿Día?");

		dia = darDatos.next();

		System.out.println("¿mes?");

		mes = darDatos.next();

		System.out.println("¿año?");

		año = darDatos.next();

		fechaDeNacimiento = dia + " de " + mes + "del " + año;
		
		alumno.setFechaDeNacimiento(fechaDeNacimiento);
		
		System.out.println(alumno);

	}
}