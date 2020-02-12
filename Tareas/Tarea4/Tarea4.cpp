// Tarea4.cpp : Este archivo contiene la función "main". La ejecución del programa comienza y termina ahí.
//

#include <iostream>
#include <conio.h>
#include <stdlib.h>

#include <string.h>
using namespace std;

struct  Nodo{

char Letra;
		Nodo* anterior;
		Nodo* siguiente;


};

Nodo* Primero; Nodo* Ultimo;
void insertarLista();
void Mostrar();
void Menu();
void Elimina();
int main() {

	Menu();
	_getch();

	return 0;
}
void Menu() {



	int opcion;
	do {
		cout << " \t.:MENU:.\n";

		cout << " 1.Insertar Datos \n";
		cout << " 2.Ver Datos \n";
		cout << " 3.Buscar  Datos \n";
		cout << " 4.Eliminar Datos \n";
		cin >> opcion;
		switch (opcion) {
		case 1:
			insertarLista();
			cout << "\n";

			system("pause");
			break;
		case 2:
			Mostrar();
			break;
		}

	}

	while (opcion != 2);
}

void insertarLista() {
	Nodo* nuevoNodo = new Nodo();
	cout << "Digite Letra";
	cin >> nuevoNodo->Letra;

	cout << nuevoNodo->Letra;
	if (Primero == NULL) {
		Primero = nuevoNodo;
		Primero->siguiente = NULL;
		Ultimo = Primero;

	}
	else
	{
		Ultimo->siguiente = nuevoNodo;
		nuevoNodo->siguiente = NULL;
		nuevoNodo->anterior = Ultimo;
		Ultimo = nuevoNodo;
	}
	cout << "ingresado";
}
void Mostrar() {

	Nodo* actual = Primero;
;
	if (Primero != NULL) {

		while (actual != NULL) {
			cout << "que pedo?" << actual->siguiente;
			actual = actual->siguiente;
		}
	}
	else {
		cout << "no hay nada en  la lista";
	}
}
void Elimina() {
	Ultimo->anterior->siguiente = NULL;
	Ultimo = Ultimo->anterior;
}

// Ejecutar programa: Ctrl + F5 o menú Depurar > Iniciar sin depurar
// Depurar programa: F5 o menú Depurar > Iniciar depuración

// Sugerencias para primeros pasos: 1. Use la ventana del Explorador de soluciones para agregar y administrar archivos
//   2. Use la ventana de Team Explorer para conectar con el control de código fuente
//   3. Use la ventana de salida para ver la salida de compilación y otros mensajes
//   4. Use la ventana Lista de errores para ver los errores
//   5. Vaya a Proyecto > Agregar nuevo elemento para crear nuevos archivos de código, o a Proyecto > Agregar elemento existente para agregar archivos de código existentes al proyecto
//   6. En el futuro, para volver a abrir este proyecto, vaya a Archivo > Abrir > Proyecto y seleccione el archivo .sln
