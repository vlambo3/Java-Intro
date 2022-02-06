/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26.gabi.magica;

import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class GabiMagica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] Matriz = new int [3][3];
        Carga(Matriz);
        boolean Fila = Filas(Matriz);
        boolean Columna = Columnas(Matriz);
        boolean Diagonal = Diagonales(Matriz);
        boolean Final = Suma(Matriz);
        if(Fila==true && Columna==true && Diagonal==true && Final==true){
            System.out.println("La Matriz es Mágica");
        }else{
            System.out.println("La Matriz NO es Mágica");
        }        
    }
    public static void Carga(int [][] Matriz){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los elementos de la Matriz(1 al 9)");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("M["+i+"]["+j+"] = ");
                Matriz[i][j]=leer.nextInt();
                while (Matriz[i][j]<0 && Matriz[i][j]>9){
                    System.out.println("Ingrese nuevamente el elemento");
                    Matriz[i][j]=leer.nextInt();                    
                }                
            }
        }
    }
 
    public static boolean Filas(int[][]Matriz){        
        int suma1= 0,suma2=0,suma3=0;
        boolean fila;
        for(int j=0;j<3;j++){
            suma1 = suma1 + Matriz[0][j];
            suma2 = suma2 + Matriz[1][j];
            suma3 = suma3 + Matriz[2][j];
        }
        if(suma1==suma2 && suma1==suma3){
            fila = true;
        }else{
            fila = false;
        }
        return fila;
    }
 
    public static boolean Columnas(int[][]Matriz){
        int suma1= 0,suma2=0,suma3=0;
        boolean columna;
        for(int i=0;i<3;i++){
            suma1 = suma1 + Matriz[i][0];
            suma2 = suma2 + Matriz[i][1];
            suma3 = suma3 + Matriz[i][2];
        }
        if(suma1==suma2 && suma1==suma3){
            columna = true; 
        }else{
            columna = false;
        }
        return columna;        
    }
 
     public static boolean Diagonales(int[][]Matriz){
        int suma1= 0,suma2=0;
        boolean diagonal;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    suma1 = suma1 + Matriz[i][j];                    
                }
                if(i+j==2){
                    suma2 = suma2 + Matriz[i][j];
                }
            }           
        }
        if(suma1==suma2){
           diagonal = true;
        }else{
            diagonal = false;
        }
        return diagonal;        
    }
 
    public static boolean Suma(int [][] Matriz){
        int F=0,C=0,D=0;
        boolean suma;
        for(int i=0;i<3;i++){
                F=Matriz[0][i] + F;
                C=Matriz[i][0] + C;
                D=Matriz[i][i] + D;
 
            }
        if(F==C && C==D){
            suma = true;
        }else{
            suma = false;
        }
        return suma;
    } 
}
