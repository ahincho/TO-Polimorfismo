
package tipos;

public class Bus implements Vehiculo {
	
	// Atributos de la Clase Bus
	
	String matricula;
	String marca;
	String modelo;
	double pasaje;
	
	// Constructor de Clase Bus
	
	public Bus(String mat, String mar, String mod, double psj) {
		
		setMatricula(mat);
		setMarca(mar);
		setModelo(mod);
		setPasaje(psj);
		
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
	
	// Metodo para simular 'tocar el claxon' del Bus
	
	@Override
	public void tocarClaxon() {
		
		System.out.println("Pim! Pim! Pim! Pim!");
		
	}
	
}
