/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.validar.a;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class ValidarA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        if (frase.substring(0,1).equals("A")) {
            System.out.println("CORRECTO");
    }
        else System.out.println("INCORRECTO");
    }
}
