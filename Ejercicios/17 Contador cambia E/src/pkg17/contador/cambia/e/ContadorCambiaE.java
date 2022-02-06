/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17.contador.cambia.e;

/**
 *
 * @author Vanina
 */
public class ContadorCambiaE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        for (int i = 0; i < 10; i++) {                            
            for (int j = 0; j < 10; j++) {                
                for (int k = 0; k < 10; k++) {                    
                    System.out.print(i != 3 ? i : "E" + "-");
                    System.out.print(j != 3 ? j : "E" + "-");
                    System.out.println(k != 3 ? k : "E");
                }
                
            }
        }
    }
    
}
