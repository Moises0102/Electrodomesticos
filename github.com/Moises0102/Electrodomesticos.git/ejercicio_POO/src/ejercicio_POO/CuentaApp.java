package ejercicio_POO;

import java.util.Scanner;

public class CuentaApp {

	public static void main(String[] args) {

		Cuenta cuenta = new Cuenta("Alfonso Rodriguez"); 

		Scanner opciones = new Scanner(System.in);

		System.out.println("¿Qué desea hacer?");

		String operaciones = opciones.next();

//		cuenta.setCantidad(0.0);

		switch(operaciones) {

		case "Ingresar":

			System.out.println("¿Qué cantidad desea Ingresar?");

			Double CantidadAIngresar = opciones.nextDouble();

			cuenta.setIngresar(CantidadAIngresar);

			System.out.println("Ingreso:"+ cuenta.getIngresar());

			break;

		case "Retirar":

			System.out.println("¿Qué cantidad desea Retirar?");

			Double CantidadARetirar = opciones.nextDouble();

			cuenta.setIngresar(CantidadARetirar);

			System.out.println("Retirado:"+ cuenta.getRetirar());

			break;

		case "cuenta":

			System.out.println(cuenta);

			System.out.println("Titular:"+ cuenta.getTitular());

			System.out.println("Cantidad:"+ cuenta.getCantidad());
			
			break;

		default: 


		}

		//		cuenta.setIngresar(1000.0);
		//
		
		//
		//		cuenta.setRetirar(100);






	}

}
