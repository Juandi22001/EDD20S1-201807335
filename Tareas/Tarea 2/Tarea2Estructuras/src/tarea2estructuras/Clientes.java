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
public class Clientes {
    
    
    private String Nombre;
    private ListaMoneda ListaMoneda= new ListaMoneda();
   public Clientes siguiente;
   private Clientes anterior;
   private int valorMoneda;
    public Clientes() {
    }

    public Clientes(String Nombre, Clientes siguiente, Clientes anterior ,ListaMoneda ListaMoneda, int valorMoneda) {
        this.Nombre = Nombre;
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.ListaMoneda =ListaMoneda;      
        this.valorMoneda=valorMoneda;
        
    }
 public String toString() {     
     String Acu="";
     Moneda aux2 = Listas.LstMoneda.Inicio;
        while (aux2 !=null) {
         Acu=aux2.getNombre() + "\n";
         
      aux2= aux2.siguiente;
        }
        return getNombre() +"  tiene"+" "+getValorMoneda()+"\n"+ Acu;

    }
    /**
    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the ListaMoneda
     */
    public ListaMoneda getListaMoneda() {
        return ListaMoneda;
    }

    /**
     * @param ListaMoneda the ListaMoneda to set
     */
    public void setListaMoneda(ListaMoneda ListaMoneda) {
        this.ListaMoneda = ListaMoneda;
    }

    /**
     * @return the siguiente
     */
    public Clientes getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Clientes siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Clientes getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Clientes anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the valorMoneda
     */
    public int getValorMoneda() {
        return valorMoneda;
    }

    /**
     * @param valorMoneda the valorMoneda to set
     */
    public void setValorMoneda(int valorMoneda) {
        this.valorMoneda = valorMoneda;
    }
     

    /**
     * @return the Nombre
     */
  
}
