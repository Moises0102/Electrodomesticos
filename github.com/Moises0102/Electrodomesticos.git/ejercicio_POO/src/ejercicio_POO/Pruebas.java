package ejercicio_POO;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//		System.out.println(generarDNI());

	}


	String contenido = "SdSFr23g";

	int longitudMinima = 8;

	int longitud;

	int comprobante = 0;

	public boolean esFuerte() {

		int mayusculas = 0;
		int numeros = 0;

// comprobarl la longitud
		do {
			if(contenido.length() != 0) {

				int m = Math.max(0, contenido.length() - 1); 

				comprobante++;
			}
		}while(comprobante != longitudMinima);

		comprobante = longitud;


	//comprobar si es fuerte	
		
		if(longitud == longitudMinima) {
			int contenedor = 0;

			int tama�o = contenido.length();


			int tama�o2 = contenido.length()-1;


			while(contenedor <contenido.length()) {

				String resto = contenido.substring(tama�o2,tama�o);

				char  letra = resto.charAt(0);

				if(Character.isUpperCase(letra)) {

					mayusculas++;
				}else if(Character.isDigit(letra)) {

					numeros++;
				}

				contenedor++;

				tama�o--;

				tama�o2--;

			}

		}else{

			return false;
			
			
		}if(mayusculas == 2 || numeros ==5) {

			System.out.println("tu contrase�a es fuerte");
			return true; 
		}
		
		return false;
	}

}