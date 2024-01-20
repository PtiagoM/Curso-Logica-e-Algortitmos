/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author Tiago e Diogo
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); 
        float notas[] = new float [4];
        float media = 0;
        
        for(int i = 0; i < notas.length; i++){
            
            System.out.printf("Digite o valor da %da nota: ", (i+1));
            notas[i] = s.nextFloat();
            media += notas[i];
            
        }
        media /= 4;
        
        
        System.out.println("-----Notas-----");
        
        for(int i = 0; i < notas.length; i++){
            
            System.out.printf("nota %d = %.2f\n", (i+1), notas[i] );  
            
        }
        
        System.out.println("A media das notas e: " + media);
        
        
    }
    
}
