/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02;

import java.util.Scanner;

/**
 *
 * @author Tiago e Diogo
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); 
        float vetor[] = new float [10];
        int i;
                
        for(i = 0; i < vetor.length; i++){
            
            System.out.printf("Digite o valor da %da posicao do vetor: ", (i+1));
            vetor[i] = s.nextFloat();
            
        }
        
        System.out.println("-----Vetor-----");
        for(i = vetor.length; i > 0; i--){
            
            System.out.printf("Posicao %d = %.2f\n", i, vetor[i-1]);  
            
        }
    }
    
}
