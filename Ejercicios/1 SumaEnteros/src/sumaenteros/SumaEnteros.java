/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaenteros;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class SumaEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese dos números enteros");
        int numEntero = leer.nextInt();
        int numEntero2 = leer.nextInt();
        
        System.out.println("La suma de los dos números ingresados es: ");
        System.out.println(numEntero + numEntero2);
    }
    
}
