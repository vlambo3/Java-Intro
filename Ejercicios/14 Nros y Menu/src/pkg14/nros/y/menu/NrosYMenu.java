/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14.nros.y.menu;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class NrosYMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros positivos");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        int menu;
        boolean condition = true;
        String option;
//        option = "N";
        while (n1 < 0 || n2 < 0) {
            System.out.println("Ingrese dos números enteros y positivos");
            n1 = leer.nextInt();
            n2 = leer.nextInt();
        }

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    int suma;
                    suma = n1 + n2;
                    System.out.println("La suma de los dos números ingresados es: " + suma);                    
                    break;
                case 2:
                    int resta;
                    resta = n1 - n2;
                    System.out.println("La resta de los dos números ingresados es: " + resta);
                    break;
                case 3:
                    int mult;
                    mult = n1 * n2;
                    System.out.println("La multiplicación de los dos números ingresados es: " + mult);
                    break;
                case 4:
                    double div;
                    div = n1 / n2;
                    System.out.println("La división de los dos números ingresados es: " + div);
                    break;
                default:
                    System.out.println("El numero ingresado no está en nuestro programa");
                    break;
                case 5:
                    System.out.println("Está seguro que desea salir de nuestro programa? (S/N)");
                    
                    option = leer.next();
                    
                    if (option.equals("S")) {  
                        System.out.println("Usted ha salido del programa");
                        condition = false;  
                        break;
                    }
            } System.out.println(condition);
        } while (condition == true);
//        System.out.println("Usted ha salido del programa");
    }
    
}

