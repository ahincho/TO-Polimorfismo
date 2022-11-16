
package tipos;

public class Auto implements Vehiculo {
	
	// Atributos de la Clase Auto
	
	String matricula;
	String marca;
	String modelo;
	int asientos;
	
	// Constructor de Clase Auto
	
	public Auto(String mat, String mar, String mod, int ats) {
		
		setMatricula(mat);
		setMarca(mar);
		setModelo(mod);
		setAsientos(ats);
		
	}
	
	// Setters y Getters
	
	@Override
	public void setMatricula(String m) { this.matricula = m; }
	
	@Override
	public String getMatricula() { return this.matricula; }
	
	@Override
	public void setMarca(String m) { this.marca = m; }
	
	@Override
	public String getMarca() { return this.marca; }
	
	@Override
	public void setModelo(String m) { this.modelo = m; }
	
	@Override
	public String getModelo() { return this.modelo; }
	
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
