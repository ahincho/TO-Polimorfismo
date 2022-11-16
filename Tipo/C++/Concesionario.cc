
# include "Auto.cc"
# include "Bus.cc"
# include "Moto.cc"
# include <iostream>

using namespace std;

int main() {

    // Vehiculo concesionario[3];

    // Con punteros se comporta raro ...

    Moto* m = new Moto("0x01", "Nexus", "110A", "4 Tiempos");
    Auto* a = new Auto("0x03", "Chery Tiggo", "8 Pro", 6);
    Bus* b = new Bus("0x02", "Yutong", "ZK6860", 3.50);

    // Usando metodos polimorficos

    m->mostrarDatos();
    m->tocarClaxon();
    cout << endl;

    a->mostrarDatos();
    a->tocarClaxon();
    cout << endl;

    b->mostrarDatos();
    b->tocarClaxon();
    cout << endl;

};
