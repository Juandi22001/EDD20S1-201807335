/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2estructuras;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class ListaMoneda {

    public Moneda Inicio;
    Moneda fin;



public ListaMoneda() {
        Inicio = null;
        fin=null;
    }
    public void Agregar(String Nombre, int valor, int cantidad) {
     
Moneda NuevoNodo = new Moneda();
 
        NuevoNodo.setCantidad(cantidad);
        NuevoNodo.setValor(valor);
        NuevoNodo.setNombre(Nombre);
       
        if (getInicio() == null) {
            Inicio =fin =NuevoNodo;
            
        } else {
           fin.setSiguiente(NuevoNodo);
            fin = NuevoNodo;
        }
    }
  public void Agregar2(String Nombre) {
     
Moneda NuevoNodo = new Moneda();
 
    
 
        NuevoNodo.setNombre(Nombre);
       
        if (getInicio() == null) {
            Inicio =fin =NuevoNodo;
            
        } else {
           fin.setSiguiente(NuevoNodo);
            fin = NuevoNodo;
        }
    }
             public void Agregar3(  int cantidad) {
     
Moneda NuevoNodo = new Moneda();
 
        NuevoNodo.setCantidad(cantidad);
 
 
       
        if (getInicio() == null) {
            Inicio =fin =NuevoNodo;
            
        } else {
           fin.setSiguiente(NuevoNodo);
            fin = NuevoNodo;
        }
    }
    public Moneda GetMoneda (String Nombre) {
            
        
        Moneda aux = Listas.LstMoneda.fin;
        while (aux != null) {
            if (aux.getNombre().equals(Nombre)) {
    
                
                return aux;
            }
            aux = aux.getSiguiente();
        }
       
        return null;

    }

  public String imprimir2() {
   Moneda aux= getInicio();
   String r = aux.toString2();
while (aux != null ) {
             System.out.println(aux.toString2());
            aux = aux.getSiguiente();
        }
       
        return r;
    }
      

    public void imprimir() {
      Moneda aux = getInicio();

        while (aux != null) {
            System.out.println(aux.toString());
            aux = aux.getSiguiente();
        }
        System.out.println();
    }

    /**
     * @return the Inicio
     */
    public Moneda getInicio() {
        return Inicio;
    }

}