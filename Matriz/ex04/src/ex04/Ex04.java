/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04;

 
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A[][] = {  //É assim que atribui os elementos de uma matriz enquanto declara ela
            {5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5},
            {7, 8, 9, 5, 6},
            {8, 5, 2, 9, 6},
            {6, 5, 4, 2, 1}
        };
        int B[][] = { //É assim que atribui os elementos de uma matriz enquanto declara ela
            {2, 3, 4, 9, 7},
            {3, 2, 5, 9, 8},
            {9, 7, 5, 2, 1},
            {7, 9, 1, 2, 3},
            {0, 1, 5, 4, 6}
        }; 
        
        int i,j,k;
        
        int em; //elemento matriz
           
        
        /*Multiplicação de Matrizes : os elementos da linha multiplica os elementos da coluna repectivamente e isso resulta nos elementos da Matriz A*B.
        Uma linha multiplica todas as colunas, formando a primeria linha da matriz AB, cada coluna multiplicada por uma unica linha forma um elemento,
        basicamente é o que esse algoritmo faz, i = linha, j = coluna, k = varredor que roda tanto as colunas quato as linhas*/
        
        for(i=0; i < A.length; i++){ //Varredura das linhas da matriz  
            for(j=0; j < A.length; j++){ // Varredura das colunas da matriz

                em = 0; //Reiniciando o resultado do elemento da matriz multiplicada

                for(k=0; k < B.length; k++){ //Rodando as linhs da Matriz B mantendo a caluna, e colunas da Matriz A mantendo a linha

                    em += A[i][k] * B[k][j]; //Lógica multipliação entre matrizes
                }
                System.out.printf(" {%d}", em); //exibindo valor

            }
            System.out.println("\n"); //pula linha

        }
        
    }
    
}
