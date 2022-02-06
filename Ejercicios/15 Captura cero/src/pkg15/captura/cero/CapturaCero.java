/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.captura.cero;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class CapturaCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, suma;
        suma = 0;
        System.out.println("Se le pedirá que ingrese 20 números");

        for (int i = 0; i < 19; i++) {

            System.out.println("Ingrese un número");
            j = sc.nextInt();
            if (j == 0) {
                System.out.println("Se capturó el número cero");
                break;
            } else if (j > 0) {
                suma = suma + j;
//                    

//                System.out.println(suma);
            }

        }
        System.out.println("La suma de los números ingresados es " + suma);
    }

}
