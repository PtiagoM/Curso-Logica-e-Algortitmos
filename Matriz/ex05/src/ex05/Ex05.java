


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        
       Scanner ler = new Scanner(System.in);
       
       double DE[][] = new double [4][4]; //DECIMAL
       
       int i,j;
       double SDP = 0; //SOMA DIAGONAL PRINCIPAL
       double SDS = 0; //SOMA SIAGONAL INVERTIDA
       
       String EDP = ""; //ELEMENTOS DIAGONAL PRINCIPAL
       String EDS = ""; //ELEMENTOS DIAGONAL SECUNDARIA
       
       
       for(i=0; i < DE.length; i++){ //varrendo as linhas da matriz
            for(j=0; j < DE.length; j++){ //varrendo as colunas da matriz
                
                System.out.printf("Digite o valor da posicao [%d][%d] da matriz: ", i, j);
                DE[i][j] = ler.nextDouble();
                
                if(i == j){ // Diagonal principal
                    EDP += DE[i][j] + "; "; //Guardando elementos da diagonal principal
                    SDP += DE[i][j]; //Somando valores da diagonal principal
                }
                
                if(i + j == DE.length - 1){ // Diagonal secundaria
                    EDS += DE[i][j] + "; "; // Guardando elementos da diagonal secundaria
                    SDS += DE[i][j]; //Somando valores da diagonal secundaria
                }
                
            }
       }
       
       System.out.printf("""
                         Diagonal Principal: %s
                         Diagonal Secundaria: %s
                         Soma diagonal principal: %.2f
                         Soma diagonal secundaria: %.2f""",
                         EDP, EDS, SDP, SDS);
       
   
       
    }
    
}
