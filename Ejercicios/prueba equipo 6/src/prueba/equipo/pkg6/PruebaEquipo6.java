/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.equipo.pkg6;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class PruebaEquipo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int matriz[][] = new int[3][3];
        lamatriz(matriz);
        mostrarmatriz(matriz);
    }

    public static void lamatriz(int matriz[][]) {

        Scanner sc = new Scanner(System.in);        
        System.out.println("Ingrese los valores de la matriz");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("[" + matriz[i][j] + "]");
//            }
//            System.out.println(" ");
//        }

    }
    public static void mostrarmatriz(int matriz[][]) {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
    }
    

