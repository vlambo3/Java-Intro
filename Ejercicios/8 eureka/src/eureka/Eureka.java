/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eureka;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String frase = leer.next();
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
    }
        else System.out.println("Incorrecto");
    }
    
}
