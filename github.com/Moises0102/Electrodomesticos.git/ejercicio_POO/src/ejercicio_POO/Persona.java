package ejercicio_POO;

public class Persona {

	


	//	Atributos 

	private String nombre;

	private int edad;

	private String DNI;

	private char sexo;

	private double peso;

	private double altura; 


	//	Constructores


	public Persona() {


	}

	public Persona(String nombre, int edad, char sexo) {

		this.nombre = nombre;

		this.edad = edad;

		this.sexo = sexo;
	}

	public Persona (String nombre, int edad, char sexo, String DNI, double peso, double altura) {

		this.nombre = nombre;

		this.edad = edad;

		this.sexo = sexo;

		this.DNI = DNI;

		this.altura = altura;

		this.peso = peso;

	}


	//metodos	

	public static double calcularIMC(double peso, double altura){


		//		o   calcularIMC(): calculará si la persona está en su peso ideal (peso en kg/(altura^2  en m)), 
		//		si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), 
		//		significa que está por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, 
		//		la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.

		double IMC = 0;

		IMC = (peso / (altura*altura));

		if(IMC < 20) {

			return -1;

		} else if(IMC >= 20 || IMC <= 25) {

			return 0;

		}else {

			return 1;
		}
	}

	public static boolean esMayorDeEdad(int edad) {

		//		o   esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.

		if(edad < 18) {

			return false;

		}else {

			return true;
		}
	}

	public static boolean comprobarSexo(char sexo) {

		//o   comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, será H. No será visible al exterior.	

		if(sexo == 'H'||sexo =='h') {

			sexo = 'H';

			System.out.println("Eres un verdadero macho");

			return true;


		}else if(sexo == 'M'||sexo =='m') {

			sexo = 'M';

			System.out.println("Eres una verdadera hembra");
			return true;

		}else if(sexo != 'H'||sexo !='h'||sexo != 'M'||sexo !='m'){

			sexo = 'H';

			return false;
		}


		if (true) {

			System.out.println("Informacion correcta. Usted es:" + sexo );

		}else {

		}
		return false;


	}

	@Override
	public String toString() {

		//		o   toString(): devuelve toda la información del objeto.

		if(peso == 0.0) {

			System.out.println();
			return "nombre: " + nombre + "\nedad: " + edad +"\nsexo: " + sexo;

		}else {

			System.out.println();

			return "nombre: " + nombre + "\nedad: " + edad + "\nDNI: " + DNI + "\nsexo: " + sexo + "\npeso: " + peso+ " \naltura=" + altura;
		}
	}

	public static String generarDNI() {

		//		o   generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. 
		//		Este método será invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. 
		//No será visible al exterior.

		String ultimaLetra = "";
		int DNI =(int)(Math.random()*10000000 +100000000);

		int restoDNI = DNI%23; 


		//		int letraDNI = (int)(Math.random()*26 +1);

		switch(restoDNI) {

		case 1:
			ultimaLetra = "A";

			break;

		case 2:
			ultimaLetra = "B";

			break;

		case 3:
			ultimaLetra = "C";

			break;

		case 4:
			ultimaLetra = "D";

			break;

		case 5:
			ultimaLetra = "E";

			break;

		case 6:
			ultimaLetra = "F";

			break;

		case 7:
			ultimaLetra = "G";

			break;

		case 8:
			ultimaLetra = "H";

			break;

		case 9:
			ultimaLetra = "I";

			break;

		case 10:
			ultimaLetra = "J";

			break;

		case 11:
			ultimaLetra = "K";

			break;

		case 12:
			ultimaLetra = "L";

			break;

		case 13:
			ultimaLetra = "M";

			break;

		case 14:
			ultimaLetra = "N";

			break;

		case 15:
			ultimaLetra = "O";

			break;

		case 16:
			ultimaLetra = "P";

			break;

		case 17:
			ultimaLetra = "Q";

			break;

		case 18:
			ultimaLetra = "R";

			break;

		case 19:
			ultimaLetra = "S";

			break;

		case 20:
			ultimaLetra = "T";

			break;

		case 21:
			ultimaLetra = "U";

			break;

		case 22:
			ultimaLetra = "V";

			break;

		case 23:
			ultimaLetra = "W";

			break;

		case 24:
			ultimaLetra = "X";

			break;

		case 25:
			ultimaLetra = "Y";

			break;

		case 26:
			ultimaLetra = "Z";

			break;

		default:
			ultimaLetra = "";

		}

		String dni = String.valueOf(DNI) + ultimaLetra;

		return dni;

	}


	//metodos de acceso a atributos

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {

		if(nombre.equals(" ")) {

			System.out.println("No se aceptan espacios vacios");

			setNombre(nombre);

		}else {

			this.nombre = nombre;
		}	

	}



	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {

		if(edad < 18) {

			System.out.println("No se aceptan menores");

		}else {

			this.edad = edad;
		}	

		this.edad = edad;

	}



	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {

		if(sexo == 'H'||sexo =='h') {

			sexo = 'H';

			//			System.out.println("Informacion correcta. Usted es:" + sexo );


		}else if(sexo == 'M'||sexo =='m') {

			sexo = 'M';

			//			System.out.println("Informacion correcta. Usted es:" + sexo );


		}else if(sexo != 'H'||sexo !='h'||sexo != 'M'||sexo !='m') {

			sexo = 'H';

		}else {

			System.out.println("Informacion incorrecta. Usted es debe repetir la información:");

			setSexo(sexo);

		}

		this.sexo = sexo;
	}



	public String getDNI() {
		return DNI;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {

		double IMC = 0;

		IMC = (peso / (altura*altura));

		if(IMC < 20) {

			System.out.println("Esta demasiado delgado");

			this.peso = peso;

		} else if(IMC >= 20 || IMC <= 25) {

			System.out.println("Se encuentra en tu peso ideal");

			this.peso = peso;

		}else {

			System.out.println("Usted tiene sobrepeso");

			this.peso = peso;
		}	

	}



	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {

		this.altura = altura;

		System.out.println("Su altura es " + altura +"m.");
	}


}

