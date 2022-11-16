
# include "Vehiculo.cc"

class Moto : public Vehiculo {

    // Atributos de la Clase Moto

    private:
        string motor;

    // Metodos de la Clase Moto

    public:
        Moto(string, string, string, string);
        void setMotor(string m);
        string getMotor();
        void mostrarDatos();
        void tocarClaxon();

};

// Constructor de Clase Moto

Moto::Moto(string mat, string mar, string mod, string mot) : Vehiculo(mat, mar, mod) {

    setMotor(mot);

};

// Setters y Getters

void Moto::setMotor(string m) { this->motor = m; };

string Moto::getMotor() { return this->motor; };

// Metodo para imprimir datos de la Moto

void Moto::mostrarDatos() {

    Vehiculo::mostrarDatos();
    cout << "Motor: " << getMotor() << endl;

};

// Metodo para simular 'tocar el claxon' en la Moto

void Moto::tocarClaxon() {

    cout << "Pam! Pam!" << endl;

};
