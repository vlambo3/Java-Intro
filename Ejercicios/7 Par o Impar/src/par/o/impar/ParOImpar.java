/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package par.o.impar;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class ParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un número");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("El número ingresado es par");
        }
        else System.out.println("El número ingresado en impar");
    }
    
}
