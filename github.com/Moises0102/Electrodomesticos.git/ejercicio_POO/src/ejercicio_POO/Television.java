package ejercicio_POO;

public class Television extends Electrodomesticos {

	
	private double resolucionEnPulgadas = 20.0;
	private boolean tdt = false;
	
	
	public Television(){
		
	}
	public Television(int precio, int peso) {
		super(precio, peso);
	}
	public Television(int precio, char letra, int peso, String color,double resolucionEnPulgadas, boolean tdt){
		super();
		this.resolucionEnPulgadas = resolucionEnPulgadas;
		this.tdt = tdt;
	
	}
	
	public double getResolucionEnPulgadas() {
		
		return resolucionEnPulgadas;
	}
	public boolean isTdt() {
		
		return tdt;
	}
	
	public double precioFinal(double precio) {
		
		precio = this.precioBase + this.precioLetra + this.precioPeso + precio;
		
		this.precio = precio;
		
		
		if (resolucionEnPulgadas > 40.0) {
		
			precio = this.precioBase + this.precioLetra + this.precioPeso + precio;
			
			precio = precio + (precio*0.30);
		
			this.precio = precio;
			
		}
		
		if(tdt = true) {
			
			precio = this.precioBase + this.precioLetra + this.precioPeso + precio;

			precio = precio + 50;
			
			this.precio = precio;
			
		}
		
		
		return this.precio;
	}
	
}
