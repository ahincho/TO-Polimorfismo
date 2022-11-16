
package clases;

public class Bus extends Vehiculo {
	
	// Atributos de la Clase Bus
	
	double pasaje;
	
	// Constructor de Clase Bus
	
	public Bus(String mat, String mar, String mod, double psj) {
		
		super(mat, mar, mod);
		setPasaje(psj);
		
	}
	
	// Setters y Getters
	
	public void setPasaje(double p) { this.pasaje = p; }
	
	public double getPasaje() { return this.pasaje; }
	
	// Metodo para imprimir datos del Bus
	
	@Override
	public void mostrarDatos() {
		
		System.out.println("Datos del Vehiculo:");
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Pasaje: " + getPasaje());
		
	}
	
	// Metodo para simular 'tocar el claxon' en el Bus
	
	@Override
	public void tocarClaxon() {
		
		System.out.println("Pim! Pim! Pim! Pim!");
		
	}
	
}
