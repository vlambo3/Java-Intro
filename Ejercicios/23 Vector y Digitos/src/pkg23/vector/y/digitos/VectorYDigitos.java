/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23.vector.y.digitos;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class VectorYDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamñaño del vector");
        int n = sc.nextInt();
        int vector[] = new int[n];
         
        for (int i = 0; i < n; i++) {
            vector [i] = (int) (Math.random()*999)+1;
        }
         
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        
        System.out.println("");        
        
        int dig1 = 0;
        int dig2 = 0;
        int dig3 = 0;
        
        for (int i = 0; i < n; i++) {
            if (vector[i] > 0 && vector[i] < 9) {
                dig1 += 1;
            }
            if (vector[i] >= 10 && vector[i] <= 99) {
                dig2 += 1;
            }
            if (vector[i] >= 100 && vector[i] <= 999) {
                dig3 += 1;
            }
        }
        
        System.out.println(dig1);
        System.out.println(dig2);
        System.out.println(dig3);
    }
    
}
