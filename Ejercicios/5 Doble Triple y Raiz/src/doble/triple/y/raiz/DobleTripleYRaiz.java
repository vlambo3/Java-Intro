/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doble.triple.y.raiz;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class DobleTripleYRaiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número entero");
        int entero = leer.nextInt();
        System.out.println("El doble del número ingresado es: " + entero*2);
        System.out.println("El triple del número ingresado es: " + entero*3);
        System.out.println("La raíz cuadrada del número ingresado es: " + Math.sqrt(entero));
    }
    
}
