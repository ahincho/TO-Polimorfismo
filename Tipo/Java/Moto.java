
package tipos;

public class Moto implements Vehiculo {
	
	// Atributos de la Clase Moto
	
	String matricula;
	String marca;
	String modelo;
	String motor;
	
	// Constructor de Clase Moto
	
	public Moto(String mat, String mar, String mod, String mot) {
		
		setMatricula(mat);
		setMarca(mar);
		setModelo(mod);
		setMotor(mot);
		
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
