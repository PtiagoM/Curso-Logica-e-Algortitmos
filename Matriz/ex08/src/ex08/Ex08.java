/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex08;

import java.util.Scanner;

public class Ex08 {

    
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
        
        int A[][] = new int [3][5];
        
        int B[][] = new int [3][5];
        
        int i,j; //varredores
        
        //Matriz A
        for(i=0; i < 3; i++){ //varrendo as linhas da matriz
            for(j=0; j < 5; j++){ //varrendo as colunas da matriz

                System.out.printf("Digite o valor da posicao [%d][%d] da matriz A: ", i, j);
                A[i][j] = ler.nextInt();
            }
        }
        
        System.out.println("\n");
        
        //Matriz B
        for(i=0; i < 3; i++){ //varrendo as linhas da matriz
            for(j=0; j < 5; j++){ //varrendo as colunas da matriz

                System.out.printf("Digite o valor da posicao [%d][%d] da matriz B: ", i, j);
                B[i][j] = ler.nextInt();
            }
        }
        
        System.out.println("\n");
        
        // Soma A+B
        for(i=0; i < 3; i++){ //Varredura das linhas da matriz  
            for(j=0; j < 5; j++){ // Varredura das colunas da matriz

                System.out.printf(" {%d}", (A[i][j] + B[i][j])); //Soma - se cada elemento respectivo de cada matriz

            }  
            System.out.println("\n");
        }
    }
}
