/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2estructuras;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class ListaClientes {
    
 Clientes Inicio;
    Clientes fin;



public ListaClientes() {
        Inicio = null;
        fin=null;
    }
    public void Agregar(String Nombre,ListaMoneda ListaMoneda, int ValorMoneda ) {
     
Clientes NuevoNodo = new Clientes();
 
        NuevoNodo.setValorMoneda(ValorMoneda);
   
        NuevoNodo.setListaMoneda(ListaMoneda);
        NuevoNodo.setNombre(Nombre);
       
        if (Inicio == null) {
            Inicio =fin =NuevoNodo;
            
        } else {
           fin.setSiguiente(NuevoNodo);
            fin = NuevoNodo;
        }
    }

           
    public Clientes GetClientes (String Nombre) {
            
        
        Clientes aux = Listas.LstClientes.fin;
        while (aux != null) {
            if (aux.getNombre().equals(Nombre)) {
    
                
                return aux;
            }
            aux = aux.getSiguiente();
        }
       
        return null;
    }
    public void imprimir() {
      Clientes aux = Inicio;
        int cont=0;
        while (aux != null) {
            cont++;
            System.out.print(cont);
            System.out.println(aux.toString());
            aux = aux.getSiguiente();
        }
    
    }

}