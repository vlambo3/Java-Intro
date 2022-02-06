/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese dos números enteros");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();                
              
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que el número " + num2);
    }
        else if (num1 < num2) {
            System.out.println("El número " + num2 + " es mayor que el número " + num1);
        }
        else 
            System.out.println("Los números son iguales");
    } 
}
