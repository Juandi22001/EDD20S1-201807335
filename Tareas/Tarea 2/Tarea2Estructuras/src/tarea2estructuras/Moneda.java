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
public class Moneda {

    private String nombre;
    private int valor;
  public Moneda siguiente;
    public Moneda anterior;
  private int cantidad ;
    public Moneda() {

    }

    public Moneda(String nombre, int valor, Moneda siguiente ,Moneda anterior, int cantidad ) {
        this.nombre = nombre;
        this.valor = valor;
        this.siguiente= siguiente;
        this.anterior=anterior;
        this.cantidad = cantidad;
        
    }
 public String toString() {
        return "Moneda{" + ",Nombre =" + getNombre()+ "Cantidad=" + getCantidad()+   '}';
    }
 public String toString2() {
        return " "+"de"+"  "+getNombre()   ;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the siguiente
     */
    public Moneda getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Moneda siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Moneda getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Moneda anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
