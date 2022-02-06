/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.largo.de.cadena;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class LargoDeCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String frase = leer.next();
        int longitud = frase.length();
                if (longitud == 8){
                    System.out.println("CORRECTO");
        }
                else System.out.println("INCORRECTO");
            }
    
}
