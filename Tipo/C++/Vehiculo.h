
# ifndef VEHICULO_H
# define VEHICULO_H

# include <iostream>
# include <string>

using namespace std;

class Vehiculo {

    // Atributos de la Clase Vehiculo

    private:
        string matricula;
        string marca;
        string modelo;

    // Metodos de la Clase Vehiculo

    public:
        Vehiculo(string, string, string);
        void setMatricula(string);
        string getMatricula();
        void setMarca(string);
        string getMarca();
        void setModelo(string);
        string getModelo();
        virtual void mostrarDatos();
        virtual void tocarClaxon();

};

// Setters y Getters

void Vehiculo::setMatricula(string m) { this->matricula = m; };

string Vehiculo::getMatricula() { return this->matricula; };

void Vehiculo::setMarca(string m) { this->marca = m; };

string Vehiculo::getMarca() { return this->marca; };

void Vehiculo::setModelo(string m) { this->modelo = m; };

string Vehiculo::getModelo() { return this->modelo; };

// Constructor de Clase Vehiculo

Vehiculo::Vehiculo(string mat, string mar, string mod) {

    setMatricula(mat);
    setMarca(mar);
    setModelo(mod);

};

// Metodo para imprimir datos del Vehiculo

void Vehiculo::mostrarDatos() {

    cout << "Datos del Vehiculo:" << endl;
    cout << "Matricula: " << getMatricula() << endl;
    cout << "Marca: " << getMarca() << endl;
    cout << "Modelo: " << getModelo() << endl;

};

// Metodo para simular 'tocar el claxon' en el Vehiculo

void Vehiculo::tocarClaxon() {

    cout << "Bonk! Bonk!" << endl;

}

# endif
