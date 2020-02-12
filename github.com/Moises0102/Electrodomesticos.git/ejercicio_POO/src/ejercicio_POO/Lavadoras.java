package ejercicio_POO;



public class Lavadoras extends Electrodomesticos{

	static int carga = 5;

	public Lavadoras(){ 
		this(precio,peso);

	}
	public Lavadoras(double precio, int peso){
		this(precio,letra,peso,color, carga);
	}
	public Lavadoras(double precio, char letra, int peso, String color, int carga) {

		super();
		this.carga = carga;
	}


	public int getCarga() {
		return carga;
	}

	//	precioFinal(): si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio. 
	//	Llama al método padre y añade el código necesario. Recuerda que las condiciones que hemos visto en la clase Electrodomestico 
	//	también deben afectar al precio.

	
	
	@Override
	public double precioFinal(){


		if(carga > 30) {
		
			precio = this.precioBase + this.precioLetra + this.precioPeso + precio;
			
			this.precio = precio + 50;
		}
		
		precio = this.precioBase + this.precioLetra + this.precioPeso + precio;
		
//		this.precio = Electrodomesticos.precio;

		return precio;

	}
	@Override
	public String toString() {
		return "Lavadoras [precio final=" + precio + ", Letra=" + letra + ", Peso=" + peso + ", Color=" + color + ", Carga=" + carga +"]";
	}


}
