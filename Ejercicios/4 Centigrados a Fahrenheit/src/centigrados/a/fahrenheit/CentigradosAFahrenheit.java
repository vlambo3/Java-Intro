/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centigrados.a.fahrenheit;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class CentigradosAFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los grados centigrados a convertir");
        float cent = leer.nextFloat();        
        float far = (32 + (9* cent /5));        
        System.out.println("El equivalente a fahrenheit es: " + far);        
    }    
}
