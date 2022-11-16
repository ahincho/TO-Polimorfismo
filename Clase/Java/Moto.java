
package clases;

public class Moto extends Vehiculo {
	
	// Atributos de la Clase Moto
	
	String motor;
	
	// Constructor de Clase Moto
	
	public Moto(String mat, String mar, String mod, String mot) {
		
		super(mat, mar, mod);
		setMotor(mot);
		
	}
	
	// Setters y Getters
	
	public void setMotor(String m) { this.motor = m; }
	
	public String getMotor() { return this.motor; }
	
	// Metodo para imprimir datos de la Moto
	
	@Override
	public void mostrarDatos() {
		
		System.out.println("Datos del Vehiculo:");
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Motor: " + getMotor());
		
	}
	
	// Metodo para simular 'tocar el claxon' en la Moto
	
	@Override
	public void tocarClaxon() {
		
		System.out.println("Pam! Pam!");
		
	}
	
}
