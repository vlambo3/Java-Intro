/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.opciones.de.bombas;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class OpcionesDeBombas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor del 1 al 4 para conocer el tipo de bomba");
        int tipoMotor = leer.nextInt();
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
        
    }
    
}
