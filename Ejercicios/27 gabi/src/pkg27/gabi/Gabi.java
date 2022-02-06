/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27.gabi;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Gabi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.*/
        int [][] M1 = new int [10][10];
        int [][] M2 = new int [3][3];
        CargaMatriz1(M1);
        MuestraMatriz1(M1);
        CargaMatriz2(M2);        
        MuestraMatriz2(M2);
        Coincidencia (M1, M2);        
 
    }
 
    public static void CargaMatriz1(int [][] M1){
        Scanner leer = new Scanner (System.in);
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.print("M1["+i+"]["+j+"]= ");
                //M1[i][j] = leer.nextInt();
                M1[i][j] = (int) (Math.random()*10); 
            }
        }
    }
 
    public static void CargaMatriz2(int [][] M2){
        Scanner leer = new Scanner (System.in);
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("M2["+i+"]["+j+"]= ");
                M2[i][j] = leer.nextInt();
                //M2[i][j] = (int) (Math.random()*10); 
            }
        }
    }
 
    public static void MuestraMatriz1(int[][] M1){
        System.out.println("Matriz 1: ");
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print("["+M1[i][j]+"]");
            }
            System.out.println(" ");
        }
    }
 
    public static void MuestraMatriz2(int[][] M2){
        System.out.println("Matriz 2: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("["+M2[i][j]+"]");
            }
            System.out.println(" ");
        }
    }
 
    public static void Coincidencia (int [][] M1, int [][] M2){
     int cont;
     cont = 0;   
    for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
            if(M1[i][j]== M2[0][0]){
                if (M1[i][j+1]== M2[0][1]){
                    if (M1[i][j+2]== M2[0][2]){
                         if (M1[i+1][j]== M2[1][0]){
                              if (M1[i+1][j+1]== M2[1][1]){
                                   if (M1[i+1][j+2]== M2[1][2]){
                                       if (M1[i+2][j]== M2[2][0]){
                                           if (M1[i+2][j+1]== M2[2][1]){
                                               if (M1[i+2][j+2]== M2[2][2]){
                                                   System.out.println("La Matriz 2 se ha hallado dentro de la Matriz 1 a partir de la posición: M2["+i+"]["+j+"]");
                                                   cont = 1; 
                                               }                                               
                                            }
                                       }  
                                   }   
                                }       
                            }
                        }
                    }
                } 
            }  
        }
     if( cont == 0){
     System.out.println("La matriz no se ha encontrado");                
    }
    }
 
 
}
    
    

