package ejercicio_POO;

//	Crearemos una clase llamada Electrodomestico con las siguientes características:

public class Electrodomesticos {

	//atributos

	int precioPeso;
	
	int precioLetra;
	
	int precioBase = 100;
	
	static double precio =  0;
	static char letra = 'F';
	static int peso = 5;
	static String color = "blanco";


	//constructores

	public Electrodomesticos() {
		this(precio,peso);
	}
	public Electrodomesticos(double precio, int peso) {

		this(precio,letra,peso,color);
	}
	public Electrodomesticos(double precio, char letra, int peso, String color) {

		this.precio = precio;
		this.letra = letra;
		this.peso = peso;
		this.color = color;

	}

	//metodos

	public  char comprobarConsumoEnergetico(char letra){

		switch(letra) {

		case 'F':
		case 'f':

			letra = 'F';
			 precioLetra = 10;
			break;

		case 'E':
		case 'e':

			letra = 'E';
			 precioLetra = 30;
			break;

		case 'D':
		case 'd':

			letra = 'D';
			 precioLetra = 50;
			break;

		case 'C':
		case 'c':

			letra = 'C';
			precioLetra = 60;
			break;

		case 'B':
		case 'b':

			letra = 'B';
			precioLetra = 80;
			break;

		case 'A': 
		case 'a':	

			letra = 'A';
			 precioLetra = 100;
			 
			break;

		default:

			if(letra != ' ')
				System.out.println("No se ha reconocido el color apropiadamente");
			 precioLetra = 100;
			letra = 'F';
			break;
		}

		this.letra = letra;

		return this.letra;


	}

	public  String comprobarColor(String color) {

		if(color == " ") {

			System.out.println("Este color no es válido");

			color = "blanco";

			this.color = color;

			return color;

		}else {

			switch (color) {

			case "blanco":
			case "Blanco":
			case "BLANCO":

				return "blanco";

			case "negro":
			case "NEGRO":
			case "Negro":

				return "negro";

			case "rojo":
			case "ROJO":
			case "Rojo":

				return "rojo";

			case "azul":
			case "AZUL":
			case "Azul":

				return "azul";

			case "gris":
			case "GRIS":
			case "Gris":

				return "gris";

			default:

				return "blanco";


			}
		}
	}

	public char getLetra() {
		
		return letra;
	}


	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {

		int precioPeso = 0;

		if(peso < 0 ) {

			System.out.println("Este peso es incorrecto");

			peso = 5;

			this.peso = peso;

		}else {
			
			int pesoInt = (peso/10);

			if(peso > 80) {

				pesoInt = 8;
			}

			


			switch (pesoInt) {

			case 0:
			case 1:

				precioPeso = 10;
				break;

			case 2:
			case 3:
			case 4:

				precioPeso = 50; 
				break;

			case 5:
			case 6:
			case 7:

				precioPeso = 80;
				break;

			case 8:

				precioPeso = 100;
				break;

			default:

				System.out.println("eso no es una cifra validad");

				peso = 5;

				precioPeso = 100;
				break;
			}


		}
		this.precioPeso = precioPeso;
		
		this.peso = peso;
	}


	public String getColor() {
		comprobarColor(color);

		return color;
	}

	public double precioFinal() {
		
		precio = this.precioBase + this.precioLetra + this.precioPeso;
		
		return precio;
	}

	@Override
	public String toString() {

		return "precio Final: " + (precioBase + precioLetra + precioPeso) + "\nletra: " + letra + "\npeso: " + peso + "\ncolor: " + color;
	}

}