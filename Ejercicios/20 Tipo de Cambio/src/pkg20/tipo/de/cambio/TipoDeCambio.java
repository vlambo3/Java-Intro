/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.tipo.de.cambio;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class TipoDeCambio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad euros a convertir");
        double cant = sc.nextInt();
        System.out.println("Ingrese la moneda a la cual quiera convertir: dolares, yenes o libras");
        String mon = sc.next(); 
       
        switch (mon) {
            case "dolares":
                double dol;
                dol = cant * 1.28611;
                change(cant, mon);
                System.out.print(dol);
                break;
            case "yenes":
                double yen;
                yen = cant * 129.852;
                change(cant, mon);
                System.out.print(yen);
                break;
            case "libras":
                double lib;
                lib = cant * 0.86;
                change(cant, mon);
                System.out.print(lib);
                break;
            default:
                System.out.println("La moneda ingresada no es válida");
                break;
        }
         System.out.println("");
    }
    
    public static void change(double cantidad, String moneda) {
        
       
        
    
        System.out.print(cantidad + " euros, a " + moneda + " equivale a: ");
    }
}
