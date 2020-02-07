#include <iostream>
#include <conio.h>
#include <stdlib.h>

	#include <string.h>
using namespace std;

class NodoEstudiante{
	
	 public :int carne;
	 public : string Nombre;
	NodoEstudiante *siguiente;
	
	
	
};
void insertarLista(NodoEstudiante *&,int,string);
void Mostrar(NodoEstudiante *);
void Menu();
	NodoEstudiante *lista =NULL;
void Buscar(NodoEstudiante *,int);	

int main() {

	Menu();

	
	getch();
	return 0;
}
void Menu(){
	
	string nombre;
	
	int opcion,dato;
	do{cout<<" \t.:MENU:.\n";
      
      cout<<" 1.Insertar Datos \n";
	  cout<<" 2.Ver Datos \n";
	  cout<<" 3.Buscar  Datos \n";
	  cout<<" 4.Eliminar Datos \n";
	  cin>>opcion;
	  switch (opcion){
	  	case 1:
	  		cout<<"Digite su nombre";
	cin>> nombre;
	cout<<"Digite su carne ";
	cin>> dato;
	insertarLista(lista,dato,nombre);
	cout<<"\n";
	
	  system("pause");
			  break;
	  	case 2:
	  		Mostrar(lista);
	  
	  system("pause");
	  	system ("cls");
		  	break;
		  	case 3:
		  		cout <<"Ingrese Carne";
				  cin>>dato;
				  Buscar(lista,dato);
				  
				  		  		system("cls");
		  		break;
 
	  }
	  
	  }
	 
	while(opcion !=3);
}

void insertarLista(NodoEstudiante *& lista ,int n ,string nombre){
	
	NodoEstudiante *nuevo_nodo = new NodoEstudiante();
	nuevo_nodo -> carne =n;
	nuevo_nodo ->Nombre =nombre;
	NodoEstudiante *aux1 = lista;
	NodoEstudiante *aux2;
	
	while((aux1 != NULL) && (aux1-> carne<n))
 {
 	
 	aux2=aux1;
 	aux1 = aux1->siguiente;
 }	
	if (lista==aux1){
		lista = nuevo_nodo;
		
		
	}
	else{
		
		aux2 -> siguiente= nuevo_nodo;
		
	}
	nuevo_nodo -> siguiente = aux1;
	cout<<"Elemento " <<nombre<<" ->"<<n<< "insertado con exito \n";
}
void Mostrar(NodoEstudiante *lista){
	NodoEstudiante *actual = new NodoEstudiante ();
	actual =lista;
	while(actual != NULL){
		cout<< actual->Nombre << "-" << actual->carne<< "->";
		actual = actual->siguiente;
	}
}

void Buscar(NodoEstudiante *lista ,int carne){
	NodoEstudiante *actual = new NodoEstudiante();
     actual =lista;
     bool val =false;
     
     while((actual != NULL)&& (actual ->carne <= carne)){
     	if(actual->carne ==carne){
     		val =true;
     	} actual =actual ->siguiente;
     	if(val==true){
     		cout<< "Elemento "<<carne<<"si existe \n";
     		cout<< actual->Nombre << "-" << actual->carne;
     		
     	}else{ cout<< "Elemento No encontrado";
     }
}
}
