/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01;

import java.util.Scanner;

/**
 *
 * @author Tiago e Diogo
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); 
        int vetor[] = new int [5];
        int i;
                
        for(i = 0; i < vetor.length; i++){
            
            System.out.printf("Digite o valor da %da posicao do vetor: ", (i+1));
            vetor[i] = s.nextInt();
            
        }
        
        System.out.println("-----Vetor-----");
        for(i = 0; i < vetor.length; i++){
            
            System.out.printf("Posicao %d = %d\n", (i+1), vetor[i] );  
            
        }
    }
    
}
