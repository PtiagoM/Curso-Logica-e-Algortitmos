/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03;

import java.util.Scanner;

public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int MI[][] = new int [3][5]; //MATRIZ INTEIRA
        
        int i, j; //varredores
        
        
        for(i=0; i < 3; i++){ //varrendo as linhas da matriz
            for(j=0; j < 5; j++){ //varrendo as colunas da matriz
                
                System.out.printf("Digite o valor da posicao [%d][%d] da matriz: ", i, j);
                MI[i][j] = ler.nextInt();
            }
        }
        
        for(i=0; i < 5; i++){ //varrendo as linhas da matriz, necessário trocar o  3 pelo 5, pois, a matriz não tem 5 linhas, então ao coloar j = 5, em                                     algum momento eu vou requisitar uma linha que não existe na matriz, assim dando erro no algoritmo
            for(j=0; j < 3; j++){ //varrendo as colunas da matriz
                
                System.out.printf("[%d]", MI[j][i]); // Imprimindo a matriz transposta, nada mais é do que uma inversão das linhas e colunas
                                                           // ou seja, a coluna vira linha e a linha vira coluna
                
            }
            System.out.print("\n"); //próxima linha
        }
    }
    
}
