/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaestructuras;

import java.util.Scanner;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class TareaEstructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("------------------"+"Bienvenido"+"---------------------------------------"+"\n");

        int matriz[][], f;
        System.out.println("Escoja Dimensiones de la matriz ");
        Scanner x3 = new Scanner(System.in);
        f = x3.nextInt();
       
     
        matriz = new int[f][f];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                matriz[0][j] = 1;
            }
        }

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                matriz[i][0] = 1;
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                matriz[f - 1][j] = 1;
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                matriz[i][f - 1] = 1;
            }
        }

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                System.out.println("\n"+"["+i+"]"+"["+j+"]");
                System.out.println(matriz[i][j]);
            }
        }
        System.out.println("listo");

    }

}
