/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22.relleno.vector.y.busqueda;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class RellenoVectorYBusqueda {

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
        int bus = sc.nextInt();
        int cont = 0;
        
        for (int i = 0; i < n; i++) {
            if (bus == vector[i]) {
                cont += 1;
            }
        }
        System.out.println("El número " + bus + " se encontró " + cont + " veces.");
    }
    
}
