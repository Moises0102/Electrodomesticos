package Escuela;

public class Alumno {

	/*Crear una clase alumno 

	 * El alumno tiene nombre, apellidos, ID(identificiador), grupo, curso y fecha de nacimiento

	 * El ID del alumno, no se espeficica con el alumno, se autogenera.
	 */

	
	
	//Atributos

	private String nombre;

	private String apellidos;

	private int ID;

	private char grupo;

	private int curso;

	private String fechaDeNacimiento;

	private static int contadorIDAlumnos = 1;	
	
	
	//constructor

	public	Alumno (String nombre, String apellidos, int ID, char grupo, int curso, String fechaDeNacimiento){

		this.nombre = nombre;

		this.apellidos = apellidos;
		
		this.ID = contadorIDAlumnos++;
		
		this.grupo = grupo;
		
		this.curso = curso;
		
		this.fechaDeNacimiento = fechaDeNacimiento;
		
		

	}

	//metodos


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		
		if(nombre == " "|| apellidos == " ") {
			
			System.out.println("No existe ese Alumno");
			
//			this.nombre = nombre;
		}
		
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
		
		
	}

	public void setApellidos(String apellidos) {
		
if(nombre == " "|| apellidos == " ") {
			
			System.out.println("No existe ese Alumno");
		}
		
		this.apellidos = apellidos;
	}


	public int getID() {
		
		return ID;
		
	}


	public char getGrupo() {
		return grupo;
	}

	public void setGrupo(char grupo) {
		
		if(grupo != 'A' || grupo != 'B' || grupo != 'C' ||grupo != 'a' || grupo != 'b' || grupo != 'c') {
			
			System.out.println("Ese grupo no existe");
		}
		this.grupo = grupo;
	}




	public int getCurso() {
		return curso;
	}
	
	public void setCurso(int curso) {
		
		
		this.curso = curso;
	}




	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}




	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", ID=" + ID + ", grupo=" + grupo + ", curso="
				+ curso + ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
	}
	
	

	
	
	
	
}
