
public class Vehiculo {
	
	// Atributos de la Clase Vehiculo
	
	String matricula;
	String marca;
	String modelo;
	
	// Constructor de Clase Vehiculo
	
	public Vehiculo(String mat, String mar, String mod) {
		
		setMatricula(mat);
		setMarca(mar);
		setModelo(mod);
		
	}
	
	// Setters y Getters
	
	public void setMatricula(String m) { this.matricula = m; }
	
	public String getMatricula() { return this.matricula; }
	
	public void setMarca(String m) { this.marca = m; }
	
	public String getMarca() { return this.marca; }
	
	public void setModelo(String m) { this.modelo = m; }
	
	public String getModelo() { return this.modelo; }
	
	// Metodo para imprimir datos del Vehiculo
	
	public void mostrarDatos() {
		
		System.out.println("Datos del Vehiculo:");
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		
	}
	
	// Metodo para simular 'tocar el claxon' en el Vehiculo
	
	public void tocarClaxon() {
		
		System.out.println("Bonk! Bonk!");
		
	}
	
}
