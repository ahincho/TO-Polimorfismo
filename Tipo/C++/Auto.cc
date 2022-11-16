
# include "Vehiculo.h"

class Auto : public Vehiculo {

    // Atributos de la Clase Auto

    private:
        int asientos;

    // Metodos de la Clase Auto

    public:
        Auto(string, string, string, int);
        void setAsientos(int a);
        int getAsientos();
        void mostrarDatos();
        void tocarClaxon();

};

// Constructor de Clase Auto

Auto::Auto(string mat, string mar, string mod, int ats) : Vehiculo(mat, mar, mod) {

    setAsientos(ats);

};

// Setters y Getters

void Auto::setAsientos(int a) { this->asientos = a; };

int Auto::getAsientos() { return this->asientos; };

// Metodo para imprimir datos del Auto

void Auto::mostrarDatos() {

    Vehiculo::mostrarDatos();
    cout << "Asientos: " << getAsientos() << endl;

};

// Metodo para simular 'tocar el claxon' en el Auto

void Auto::tocarClaxon() {

    cout << "Bam! Bam!" << endl;

};
