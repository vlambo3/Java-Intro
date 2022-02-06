/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25.matriz.transpuesta.y.antisimetrica;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class MatrizTranspuestaYAntisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz");
        int n = sc.nextInt();
        int matriz[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                matriz[i][j] = (int) (Math.random() * 0);
                int num;
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        
        System.out.println("");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println(" ");
        }
        
//        int cont0 = 0;
        int cont = 0;

//        for (int z = 0; z < n; z++) {

            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n; i++) {

//                    if (i == j) {
//                        if (matriz[i][j] == matriz[0][0]) {
//                            cont0 += 1;
//                        }
//                    }
                    if (matriz[i][j] == -(matriz[j][i])) {
                        cont += 1;
                    }

                }

            }
//            System.out.println(cont0);
            System.out.println(cont);
//            if (cont0 == n && cont == ((n * n))) {
              if (cont == (n*n)) {
                System.out.println("La matriz transpuesta es anti simétrica");
//            }
        }
    }
}
