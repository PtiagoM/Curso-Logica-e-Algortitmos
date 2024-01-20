/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex07;

import java.util.Scanner;

public class Ex07 {

    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int MI[][] = { //MATRIZ INTEIROS
                {12, 2, 45, 3},
                {14, 5, 120, 6},
                {17, 15, 56, 60},
                {23, 25, 33, 40}
        };
        
        int i,j;
        double Mr; //multiplicador real
        
        System.out.print("Insira o multiplicador da matriz: ");
        Mr = ler.nextDouble();
        
        for(i=0; i < MI.length; i++){ 
            for(j=0; j < MI.length; j++){
                
                System.out.printf(" {%.1f}", (MI[i][j] * Mr)); //Multiplicando cada elememento da matriz pelo multplicador e o exibindo
                
            }
            System.out.println("\n"); //pula linha
        }
        
    }
    
}
