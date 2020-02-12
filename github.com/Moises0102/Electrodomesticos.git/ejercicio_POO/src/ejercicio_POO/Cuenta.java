package ejercicio_POO;

import java.util.Scanner;

public class Cuenta {

	//Atributos: suelen ser privados

	private String titular;

	private double cantidad;

	private double ingresar;

	private double retirar;

	
	
	//Constructores

	public Cuenta(String titular) {

		this.titular = titular; 

	}

	public Cuenta(String titular, double cantidad) {

		this.titular = titular; 
		this.cantidad = cantidad; 
	}

	
	
	//metodos

	public String getTitular() {

		return titular;	

	}

	public void setTitular(String titular) {
		if(titular.equals("")) {
			System.out.println("No se aceptan espacios vacios");

		}else {

			this.titular = titular;
		}

	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		if(cantidad <0.0) {
			System.out.println("Muchacho empieza ahorrar que estás volviendo a 2007");

		}else {

			this.cantidad = cantidad + ingresar;
		}	
	}

	
	

	public double getIngresar() {
		return ingresar;
	}



	public void setIngresar(double ingresar) {

		if(ingresar <0.0) {

			System.out.println("Debes ingresar una cantidad superior a 0.0");

			this.ingresar = ingresar;

		}else {
			
			this.ingresar = ingresar;

			
		}
	}



	public double getRetirar() {
		return retirar;
	}



	public void setRetirar(double retirar) {
		this.retirar = retirar;


		if(cantidad <= 0.0) {

			System.out.println("No puedes retirar dinero en este momento");

			this.cantidad = 0.0;
			
			this.retirar = retirar;

		}else {

			this.retirar = retirar;

			this.cantidad= cantidad - retirar;
		}
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad +"]";
	}

	




}