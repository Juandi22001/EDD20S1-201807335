/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2estructuras;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class Tarea2Estructuras {

    public static boolean error = true;
    public Moneda siguiente;
    public Moneda anterior;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Menu();
    }

    public static void Menu() {

        System.out.println("1. Crear Monedas");
        System.out.println("2. Agregar Moneda");
        System.out.println("3 Transferencia entre Usuarios");
        System.out.println("4  Ver Monedas y Usuarios");
        System.out.println("5  Crear Usuario");

        System.out.println("6  Añadir Monedas Usuario");

        System.out.println("7 Agregar una nueva moneda al usuario");

        int y = 0;

        do {
            error = true;
            try {
                Scanner x = new Scanner(System.in);
                y = x.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto");
                error = false;
            }
            if (y < 1 || y > 8) {
                System.out.println("Ingrese un numero correcto");
                error = false;
            }

        } while (error != true);

        switch (y) {
            case 1:

                CrearMoneda();
                break;

            case 2:
                AgregarCantidad();
                break;

            case 3:
               Transacciones();
                break;

            case 4:
                VerMonedas();
                break;
                
            case 5:
                CrearUsuario();
                break;

            case 6:
                AgregarMonedasA();
                break;

            case 7:
             AgregarNewMonedaA();
                break;
        }

    }
    public static void AgregarNewMonedaA(){
         String nombreUsuario;
        String Moneda2;
        int valor;
        int cantidad;
        
        boolean v1=false;
        boolean v2 =false;
        System.out.println("Crear Cliente ");
        System.out.println("Ingrese Nombre " + "\n");
        Scanner x = new Scanner(System.in);
        nombreUsuario = x.next();
        Clientes aux = Listas.LstClientes.Inicio;
        Moneda aux2 = Listas.LstMoneda.Inicio;
boolean a
        =false;
        while (aux != null) {
            if (aux.getNombre().equals(nombreUsuario)) {
                System.out.println("OK ");
      
                 a=true;

            } 
            aux = aux.siguiente;
        }
        if (a=true) {
            
        }else {
                System.out.println("No existe un nombre con ese usuario");
               AgregarNewMonedaA();
            }

        System.out.println("Ingrese Moneda" + "\n");
        Scanner x3 = new Scanner(System.in);
        Moneda2 = x3.next();

        System.out.println("Ingrese el Monto" + "\n");
        Scanner x4 = new Scanner(System.in);
        cantidad = x4.nextInt();

        ListaMoneda LstMoneda = new ListaMoneda();
        Object[] NombreMoneda = Moneda2.split("");
        for (Object Nombre : NombreMoneda) {
            Moneda NodoEncontrado = Listas.LstMoneda.GetMoneda(Moneda2);
            while (aux2 != null) {
                if (aux2.getNombre().equals(Moneda2) ) {
                    System.out.println("ok");
                    int a2 = aux2.getCantidad() - cantidad;
                    aux2.setCantidad(a2);
                    v2=true;
                } 
                aux2 = aux2.siguiente;
            }

            LstMoneda.Agregar2(Moneda2);
            Listas.LstClientes.Agregar(nombreUsuario, LstMoneda,cantidad);

        }
        if (v2=true) {
            
        }else{
            System.out.println("la moneda que ingreso no existe");}
        System.out.println("1. regresar");
        System.out.println("2. Crear Usuario");

        int y = 0;

        do {
            error = true;
            try {
                Scanner x8 = new Scanner(System.in);
                y = x8.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto");
                error = false;
            }
            if (y < 1 || y > 2) {
                System.out.println("Ingrese un numero correcto");
                error = false;
            }

        } while (error != true);

        switch (y) {
            case 1:
                Menu();

                break;

            case 2:
                CrearUsuario();
                break;

        }

    }
public static void Transacciones(){
     String nombreUsuario;
     String nombreUsuario2;
        String Moneda2;
        int a;
        int a2;
        int cantidad;
        int valor;
        boolean v=false;
        System.out.println("Transacciones entre Usuarios ");
        System.out.println("Ingrese su nombre de Usuario " + "\n");
        Scanner x = new Scanner(System.in);
        nombreUsuario = x.next();
        Clientes aux = Listas.LstClientes.Inicio;
        Clientes aux2 = Listas.LstClientes.Inicio;

       

  

        System.out.println("Ingrese Moneda" + "\n");
        Scanner x3 = new Scanner(System.in);
        Moneda2 = x3.next();
   System.out.println("Ingrese el Monto" + "\n");
        Scanner x4 = new Scanner(System.in);
        cantidad = x4.nextInt();
        System.out.println("Ingrese el nombre a depositar " + "\n");
        Scanner x22 = new Scanner(System.in);
        nombreUsuario2 = x22.next();
        
              while (aux != null) {
        if (aux.getNombre().equals(nombreUsuario)) {
            Moneda nodoM = aux.getListaMoneda().Inicio;
            while (nodoM != null) {
                if (nodoM.getNombre().equals(Moneda2)) {

                    System.err.println("SIUU1");
                    a = aux.getValorMoneda() - cantidad;
                    aux.setValorMoneda(a);
break;
                }

                nodoM = nodoM.siguiente;
            }

        }
        aux = aux.siguiente;
    }
              
              
               while (aux2 != null) {
        if (aux2.getNombre().equals(nombreUsuario2)) {
            Moneda nodoM2 = aux2.getListaMoneda().Inicio;
            while (nodoM2 != null) {
                if (nodoM2.getNombre().equals(Moneda2)) {

                    System.err.println("SIUU2");
                    a2 = aux2.getValorMoneda() + cantidad;
                    aux2.setValorMoneda(a2);
break;
                }

                nodoM2= nodoM2.siguiente;
            }

        }
        aux2 = aux2.siguiente;
    }
        
      
        


        System.out.println("1. regresar");
        System.out.println("2. Crear Usuario");

        int y = 0;

        do {
            error = true;
            try {
                Scanner x8 = new Scanner(System.in);
                y = x8.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto");
                error = false;
            }
            if (y < 1 || y > 2) {
                System.out.println("Ingrese un numero correcto");
                error = false;
            }

        } while (error != true);

        switch (y) {
            case 1:
                Menu();

                break;

            case 2:
                CrearUsuario();
                break;

        }

}
    public static void CrearMoneda() {
        String nombreMoneda;
        int valor;
        int cantidad;
        System.out.println("Crear Monedas ");
        System.out.println("Ingrese Nombre " + "\n");
        Scanner x = new Scanner(System.in);
        nombreMoneda = x.next();
        Moneda aux = Listas.LstMoneda.getInicio();

        while (aux != null) {
            if (aux.getNombre().equals(nombreMoneda)) {
                System.out.println("Ya existe un nombre  con esa moneda ");
                CrearMoneda();

                return;

            }
            aux = aux.siguiente;
        }

        System.out.println();

        System.out.println("Ingrese valor" + "\n");
        Scanner x2 = new Scanner(System.in);
        valor = x2.nextInt();
        System.out.println("Ingrese Cantidad" + "\n");
        Scanner x3 = new Scanner(System.in);
        cantidad = x3.nextInt();
        System.out.println(nombreMoneda + "-" + valor + "-" + cantidad);
        Listas.LstMoneda.Agregar(nombreMoneda, valor, cantidad);

        System.out.println("1. regresar");
        System.out.println("2. Crear Moneda");

        int y = 0;

        do {
            error = true;
            try {
                Scanner x4 = new Scanner(System.in);
                y = x4.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto");
                error = false;
            }
            if (y < 1 || y > 2) {
                System.out.println("Ingrese un numero correcto");
                error = false;
            }

        } while (error != true);

        switch (y) {
            case 1:
                Menu();

                break;

            case 2:
                CrearMoneda();
                break;

        }

    }

    public static void CrearUsuario() {
        String nombreUsuario;
        String Moneda2;
        int valor;
        int cantidad;
        System.out.println("Crear Cliente ");
        System.out.println("Ingrese Nombre " + "\n");
        Scanner x = new Scanner(System.in);
        nombreUsuario = x.next();
        Clientes aux = Listas.LstClientes.Inicio;
        Moneda aux2 = Listas.LstMoneda.Inicio;

        while (aux != null) {
            if (aux.getNombre().equals(nombreUsuario)) {
                System.out.println("Ya existe un nombre  con ese Usuario ");
                CrearUsuario();

                return;

            }
            aux = aux.siguiente;
        }

      

        System.out.println("Ingrese Moneda" + "\n");
        Scanner x3 = new Scanner(System.in);
        Moneda2 = x3.next();
boolean v=false;
        System.out.println("Ingrese el Monto" + "\n");
        Scanner x4 = new Scanner(System.in);
        cantidad = x4.nextInt();
       boolean V= false;
        ListaMoneda LstMoneda = new ListaMoneda();
            while (aux2 != null) {
                if (aux2.getNombre().equals(Moneda2) && aux2.getCantidad() > cantidad) {
                    System.out.println("ok");
                    int a2 = aux2.getCantidad() - cantidad;
                    aux2.setCantidad(a2);
                      v=true;
                } 
                aux2 = aux2.siguiente;
            }

            LstMoneda.Agregar2(Moneda2);
            Listas.LstClientes.Agregar(nombreUsuario, LstMoneda,cantidad);

         
        
        if (v=true) {
            
        }else{
            System.out.println("datos incorrectos")
                    ; CrearUsuario();}
        System.out.println("1. regresar  guapo");
        System.out.println("2. Crear Usuario");

        int y = 0;

        do {
            error = true;
            try {
                Scanner x8 = new Scanner(System.in);
                y = x8.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto");
                error = false;
            }
            if (y < 1 || y > 2) {
                System.out.println("Ingrese un numero correcto");
                error = false;
            }

        } while (error != true);

        switch (y) {
            case 1:
                Menu();

                break;

            case 2:
                CrearUsuario();
                break;

        }

    }

    public static void VerMonedas() {
        Listas.LstMoneda.imprimir();
        Listas.LstClientes.imprimir();
        System.out.println(" si desea volver a menu presione 1"
                + "");
  
        int y = 0;

        do {
            error = true;
            try {
                Scanner x5 = new Scanner(System.in);
                y = x5.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto");
                error = false;
            }
            if (y < 1 || y > 1) {
                System.out.println("Ingrese un numero correcto");
                error = false;
            }

        } while (error != true);
        switch (y) {
            case 1:
                Menu();

                break;

        }
    }

    public static void AgregarCantidad() {
        String Moneda;
        boolean V = false;
        int Monto = 0;
        int Monto2 = 0;
        System.out.println("Ingrese Moneda" + "\n");
        Scanner x5 = new Scanner(System.in);
        Moneda = x5.next();

        System.out.println("Ingrese Monto" + "\n");
        Scanner x6 = new Scanner(System.in);
        Monto = x6.nextInt();

        Moneda aux = Listas.LstMoneda.getInicio();
boolean v= false;
        while (aux != null) {
            if (aux.getNombre().equals(Moneda)) {
                Monto2 = aux.getCantidad() + Monto;
                aux.setCantidad(Monto2);
                System.out.println(aux.getCantidad() + "\n");
             v =true;
                return;

            }
            aux = aux.siguiente;
        }

        if(v=true){
        
        }else{
            System.out.println("no existe un nombre con esa moneda");}
        System.out.println("volver a menu presione 1"
                + "");
        int y = 0;

        do {
            error = true;
            try {
                Scanner x7 = new Scanner(System.in);
                y = x7.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto");
                error = false;
            }
            if (y < 1 || y > 1) {
                System.out.println("Ingrese un numero correcto");
                error = false;
            }

        } while (error != true);

        switch (y) {
            case 1:
                Menu();

                break;

        }
    }
    public static void AgregarMonedasA(){
          String nombreUsuario;
        String Moneda2;
        int a;
        int cantidad;
        int valor;
        boolean v=false;
        System.out.println("Agregar Moneda a los Usuarios ");
        System.out.println("Ingrese Nombre " + "\n");
        Scanner x = new Scanner(System.in);
        nombreUsuario = x.next();
        Clientes aux = Listas.LstClientes.Inicio;
        Moneda aux2 = Listas.LstMoneda.Inicio;

       

  

        System.out.println("Ingrese Moneda" + "\n");
        Scanner x3 = new Scanner(System.in);
        Moneda2 = x3.next();
   System.out.println("Ingrese el Monto" + "\n");
        Scanner x4 = new Scanner(System.in);
        cantidad = x4.nextInt();
        
                 while (aux2 != null) {
                if (aux2.getNombre().equals(Moneda2)) {
                    System.err.println("SIUU1");
                     a = aux2.getCantidad() - cantidad;
                    aux2.setCantidad(a);

                    System.out.println("moneda existente");
                } else {
                    System.out.println("vuelva a ingresar la moneda");


                }
                aux2 = aux2.siguiente;
            }
        
     
         
        ListaMoneda LstMoneda = new ListaMoneda();
        Object[] NombreMoneda = Moneda2.split("");
      
        boolean av = false;
         while (aux != null) {
            if (aux.getNombre().equals(nombreUsuario)) {
    
                  valor =aux.getValorMoneda() + cantidad;
                       aux.setValorMoneda(valor);
             av=true;
            }
            aux = aux.siguiente;
        }
        if (av=true) {
            
        }else{
            System.out.println("el usuario no existe");}
               
              
   
      
        System.out.println("1. regresar");
        System.out.println("2. Crear Usuario");

        int y = 0;

        do {
            error = true;
            try {
                Scanner x8 = new Scanner(System.in);
                y = x8.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto");
                error = false;
            }
            if (y < 1 || y > 2) {
                System.out.println("Ingrese un numero correcto");
                error = false;
            }

        } while (error != true);

        switch (y) {
            case 1:
                Menu();

                break;

            case 2:
                CrearUsuario();
                break;

        }

   

    }}
