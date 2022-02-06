/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.validar.nota;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class ValidarNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un número entre 1 y 10");
            num = leer.nextInt();            
        } while (num < 0 || num > 10);
        System.out.println("El número es correcto");
        }    
}
