/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18.cuadrado;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un nro");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }

        System.out.println("");

        for (int i = 0; i < (n-2); i++) {  //filas ==> siempre dos menos
            for (int j = 0; j < n; j++) { // columnas ===> todas
                if (j == 0) {
                    System.out.print("* ");
                } 
                else if (j >= 1 && j < (n-1)) {
                    System.out.print("  ");
                } 
                else if (j == (n-1)) {
                    System.out.println("* ");
                }
            }
        }
          
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }
}
