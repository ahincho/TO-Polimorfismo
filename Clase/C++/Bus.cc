
# include "Vehiculo.cc"

class Bus : public Vehiculo {

    // Atributos de la Clase Bus

    private:
        double pasaje;

    // Metodos de la Clase Bus

    public:
        Bus(string, string, string, double);
        void setPasaje(double p);
        double getPasaje();
        void mostrarDatos();
        void tocarClaxon();

};

// Constructor de Clase Bus

Bus::Bus(string mat, string mar, string mod, double psj) : Vehiculo(mat, mar, mod) {

    setPasaje(psj);

};

// Setters y Getters

void Bus::setPasaje(double p) { this->pasaje = p; };

double Bus::getPasaje() { return this->pasaje; };

// Metodo para imprimir datos del Bus

void Bus::mostrarDatos() {

    Vehiculo::mostrarDatos();
    cout << "Pasaje: " << getPasaje() << endl;

};

// Metodo para simular 'tocar el claxon' en el Vehiculo

void Bus::tocarClaxon() {

    cout << "Pim! Pim! Pim! Pim!" << endl;

};
