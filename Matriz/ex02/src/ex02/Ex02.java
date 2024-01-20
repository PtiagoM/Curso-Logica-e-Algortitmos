  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02;

import java.util.Scanner; // Importando a classe Scanner


public class Ex02 {

    
    public static void main(String[] args) {   
        
        Scanner ler = new Scanner(System.in); // Declarando a classe Scanner como objeto "ler" com o método "System.in" para ler as informações no terminal
        
        int MI[][] = new int [3][3]; //Declarando MATRIZ INTEIROS quadrada 5x5 
        
        int i, j; //Declarando varredores  
        
        int sc[] = new int [3]; // soma de cada uma das 5 colunas da matriz
        int sl[] = new int [3]; // soma de cada uma das 5 linhas da matriz
        int si = 0; // soma dos números ímpares
        
        for(i=0; i < MI.length; i++){ //varrendo as linhas da matriz
            for(j=0; j < MI.length; j++){ //varrendo as colunas da matriz
                
                System.out.printf("Digite o valor da posicao [%d][%d] da matriz: ", i, j); /*Formatação de string na saída de informação, "%
                d" serve para fazer referência a um termo inteiro que vai ser digitado após a virgula, eles vão assumir posições respectivas aos valores 
                digitados depois da ",". o %d é pra números inteiros, %s, para string, %.f1(esse 1 pode mudar, ele indica o número de casas decimais), 
                para float/dooble*/
                
                MI[i][j] = ler.nextInt(); /* Usanddo o Scanner para ler a informação digitada pelo usuáro, ler(objeto para referenciar a classe Scanner,
                                             determinado lá na declaração).nextInt (método, que é ler um número inteiro)*/
                
                sc[j] += MI[i][j]; //Somando as colunas da matriz, na posição do vetor respectiva,  determinado por j
                sl[i] += MI[i][j]; // Somando as linhas da matriz, na posição do vetor respectiva, determinado por i
                
                if(MI[i][j] % 2 != 0){ // Se o elemento da matriz dividido por 2 der uma sobra (%) diferente (!=) de 0... Ou seja, se o número for ímpar  
                    si += MI[i][j]; // Somando os números ímpares
                }
                   
            }
        }
        
        for (i=0; i < sc.length; i++){ // Imprimindo o vetor criado para guardar a soma das colunas da matriz
            System.out.printf("A soma da coluna %d da matriz: %d \n", (i+1), sc[i]); /* "(i+1)" isso é pra se referir ao índice do vetor 0 como 1, pq o                                                                                               vetor começa no índice 0 mas na posição 1*/
        }
        
        for (i=0; i < sc.length; i++){ // Imprimindo o vetor criado para guardar a soma das linhas da matriz
            System.out.printf("A soma da linha %d da matriz: %d \n", (i+1), sl[i]); 
        }
        
        System.out.print("\nA soma dos numeros impares da matriz e: "+ si); 
        
        
    }
    
}
