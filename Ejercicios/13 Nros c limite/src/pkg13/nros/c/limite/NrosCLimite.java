/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13.nros.c.limite;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class NrosCLimite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número que se usará como límite");
        int limite = leer.nextInt();
        int num;
        double suma;
        suma = 0;
                
        while (suma < limite) {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            suma = suma + num; 
        }
        System.out.println("Los números ingresados, han superado el límite incial");
    }
    
}
