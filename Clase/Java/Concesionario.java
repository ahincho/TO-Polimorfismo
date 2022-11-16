
package clases;

public class Concesionario {
	
	public static void main(String[] args) {
		
		Vehiculo[] concesionario = new Vehiculo[3];
		concesionario[0] = new Moto("0x01", "Nexus", "110A", "4 Tiempos");
		concesionario[1] = new Bus("0x02", "Yutong", "ZK6860", 3.50);
		concesionario[2] = new Auto("0x03", "Chery Tiggo", "8 Pro", 6);
		
		for ( int i = 0 ; i < concesionario.length ; i++ ) {
			
			System.out.println("Vehiculo N° " + i);
			concesionario[i].mostrarDatos();
			concesionario[i].tocarClaxon();
			System.out.println();
			
		}
		
	}
	
}
