/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex09;

import java.util.Scanner;


public class Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int A[][] = new int [3][3];
        
        int B[][] = new int [3][3];
        
        int i,j; //varredores
        
        //Matriz A
        for(i=0; i < A.length; i++){ //varrendo as linhas da matriz
            for(j=0; j < A.length; j++){ //varrendo as colunas da matriz

                System.out.printf("Digite o valor da posicao [%d][%d] da matriz A: ", i, j);
                A[i][j] = ler.nextInt();
            }
        }
        
        System.out.println("\n");
        
        //Matriz B
        for(i=0; i < B.length; i++){ //varrendo as linhas da matriz
            for(j=0; j < B.length; j++){ //varrendo as colunas da matriz

                System.out.printf("Digite o valor da posicao [%d][%d] da matriz B: ", i, j);
                B[i][j] = ler.nextInt();
            }
        }
        
        System.out.println("\n");
        
        // Subtração A+B
        for(i=0; i < A.length; i++){ //Varredura das linhas da matriz  
            for(j=0; j < A.length; j++){ // Varredura das colunas da matriz

                System.out.printf(" {%d}", (A[i][j] - B[i][j])); // Subtração - se cada elemento respectivo de cada matriz

            }  
            System.out.println("\n");
        }
    }
        
}
