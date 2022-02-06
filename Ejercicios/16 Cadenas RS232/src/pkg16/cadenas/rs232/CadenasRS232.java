/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16.cadenas.rs232;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class CadenasRS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean FDE;
        FDE = true;
        int correct = 0;
        int incorrect = 0;
        do  {
            String cadena;
            System.out.println("Ingrese una cadena de cinco caracteres que comience con X y termine con O");
            cadena = sc.next();
            int n = cadena.length();
            if (n < 6) {
                if ((cadena.startsWith("X")) && (cadena.endsWith("O"))) {
                    correct = correct + 1;
                }
            } else {
                incorrect = incorrect + 1;
            }
            if (cadena.equals("&&&&&")) {
                FDE = false;
            }
        }
        while (FDE == true) ;
        
        System.out.println("Las cadenas que respetaron el formato fueron: " + correct);
        System.out.println("Las cadenas que no respetaron el formato fueron: " + incorrect);
    }

}
