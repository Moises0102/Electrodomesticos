package ejercicio_POO;

//Haz una clase llamada Password que siga las siguientes condiciones:


public class Password {

	//Atributos

	//	·       Que tenga los atributos longitud y contenido. Por defecto, la longitud será de 8.
	//
	//	·       Los constructores serán los siguiente:


	private int longitud = 8;
	private String contenido;


	//construcctores

	//	o   Un constructor por defecto.
	//
	//	o   Un constructor con la longitud que nosotros le pasemos. Generará una contraseña aleatoria con esa longitud.


	public Password(){

	}

	public Password(int longitud, String contenido) {

		longitud = 8;

		this.longitud = longitud;

		this.contenido = contenido;

	}

	//metodos
	//
	//		o   esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener 
	//           más de 2 mayúsculas, más de 1 minúscula y más de 5 números.
	//
	//		o   generarPassword():  genera la contraseña del objeto con la longitud que tenga.
	//
	//		o   Método get para contraseña y longitud.
	//
	//		o   Método set para longitud.


	public boolean esFuerte() {
		if(longitud == 8 ) {
			int contenedor = 0;

			int tamaño = contenido.length();

			String frase = "";

			int tamaño2 = contenido.length()-1;

			while(contenedor <contenido.length()) {

				String letras = contenido.substring(tamaño2,tamaño);

				System.out.print(letras);

				frase = letras + letras;

				contenedor++;

				tamaño--;

				tamaño2--;
				//				if (tamaño != 1) {
				//					
				//					
				//				}else {
				//					
				//					tamaño2 = 0;
				//				}

			}	
		}else {
			return false;
		}


		return false;
	}

	public String generarPassword() {

		return "";
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}



	//
	//

	//
	//			Ahora, crea una clase clase ejecutable:
	//
	//			·       Crea un array de Passwords con el tamaño que tú le indiques por teclado.
	//
	//			·       Crea un bucle que cree un objeto para cada posición del array.
	//
	//			·       Indica también por teclado la longitud de los Passwords (antes de bucle).
	//
	//			·       Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
	//
	//			·       Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
	//
	//			contraseña1 valor_booleano1
	//
	//			contraseña2 valor_bololeano2
	//
	//			…


}
