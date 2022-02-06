/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nros.con.asteriscos;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Nuevo {

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
                if (i == 0) {
                    System.out.print("n1");                    
                }
                System.out.println("*");
            }
           
        }
       
        }
    }

