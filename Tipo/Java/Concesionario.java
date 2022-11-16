
package tipos;

public class Concesionario {
	
	public static void main(String[] args) {
		
		// Vehiculo[] concesionario = new Vehiculo[3];
		Moto m = new Moto("0x01", "Nexus", "110A", "4 Tiempos");
		Bus b = new Bus("0x02", "Yutong", "ZK6860", 3.50);
		Auto a = new Auto("0x03", "Chery Tiggo", "8 Pro", 6);
		
		// Para el Objeto Moto
		m.mostrarDatos();
		m.tocarClaxon();
		System.out.println();
		
		// Para el Objeto Bus
		b.mostrarDatos();
		b.tocarClaxon();
		System.out.println();
		
		// Para el Objeto Auto
		a.mostrarDatos();
		a.tocarClaxon();
		System.out.println();
		
	}
	
}
