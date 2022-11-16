
package clases;

public class Auto extends Vehiculo {
	
	// Atributos de la Clase Auto
	
	int asientos;
	
	// Constructor de Clase Auto
	
	public Auto(String mat, String mar, String mod, int ats) {
		
		super(mat, mar, mod);
		setAsientos(ats);
		
	}
	
	// Setters y Getters
	
	public void setAsientos(int a) { this.asientos = a; }
	
	public int getAsientos() { return this.asientos; }
	
	// Metodo para imprimir datos del Auto
	
	@Override
	public void mostrarDatos() {
		
		System.out.println("Datos del Vehiculo:");
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Asientos: " + getAsientos());
		
	}
	
	// Metodo para simular 'tocar el claxon' en el Auto
	
	@Override
	public void tocarClaxon() {
		
		System.out.println("Bam! Bam!");
		
	}
	
}
