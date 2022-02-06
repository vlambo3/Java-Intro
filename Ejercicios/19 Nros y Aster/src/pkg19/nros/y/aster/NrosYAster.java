/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19.nros.y.aster;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class NrosYAster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuatro números entre el 1 y el 20");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            for (int j = 1; j < n1; j++) {
                if (i == 0 && j == 1) {
                    System.out.print(n1);
                }
            }
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < n2; i++) {
            for (int j = 1; j < n2; j++) {
                if (i == 0 && j == 1) {
                    System.out.print(n2);
                }
            }
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < n3; i++) {
            for (int j = 1; j < n3; j++) {
                if (i == 0 && j == 1) {
                    System.out.print(n3);
                }
            }
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < n4; i++) {
            for (int j = 1; j < n4; j++) {
                if (i == 0 && j == 1) {
                    System.out.print(n4);
                }
            }
            System.out.print("*");
        }
    }

}
