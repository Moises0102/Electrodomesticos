package ejercicio_POO;

//Haz una clase llamada Password que siga las siguientes condiciones:


public class Password {

	//Atributos

	//	�       Que tenga los atributos longitud y contenido. Por defecto, la longitud ser� de 8.
	//
	//	�       Los constructores ser�n los siguiente:


	private int longitud = 8;
	private String contenido;


	//construcctores

	//	o   Un constructor por defecto.
	//
	//	o   Un constructor con la longitud que nosotros le pasemos. Generar� una contrase�a aleatoria con esa longitud.


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
	//           m�s de 2 may�sculas, m�s de 1 min�scula y m�s de 5 n�meros.
	//
	//		o   generarPassword():  genera la contrase�a del objeto con la longitud que tenga.
	//
	//		o   M�todo get para contrase�a y longitud.
	//
	//		o   M�todo set para longitud.


	public boolean esFuerte() {
		if(longitud == 8 ) {
			int contenedor = 0;

			int tama�o = contenido.length();

			String frase = "";

			int tama�o2 = contenido.length()-1;

			while(contenedor <contenido.length()) {

				String letras = contenido.substring(tama�o2,tama�o);

				System.out.print(letras);

				frase = letras + letras;

				contenedor++;

				tama�o--;

				tama�o2--;
				//				if (tama�o != 1) {
				//					
				//					
				//				}else {
				//					
				//					tama�o2 = 0;
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
	//			�       Crea un array de Passwords con el tama�o que t� le indiques por teclado.
	//
	//			�       Crea un bucle que cree un objeto para cada posici�n del array.
	//
	//			�       Indica tambi�n por teclado la longitud de los Passwords (antes de bucle).
	//
	//			�       Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
	//
	//			�       Al final, muestra la contrase�a y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
	//
	//			contrase�a1 valor_booleano1
	//
	//			contrase�a2 valor_bololeano2
	//
	//			�


}
