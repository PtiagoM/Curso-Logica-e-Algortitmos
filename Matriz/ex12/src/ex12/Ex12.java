/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12;

/**
 *
 * @author Tiago e Diogo
 */
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int A[][] = {
                {-3, -2, 1, 5, 6},
                {7, 8, 9, -1, -4},
                {6, 5, 4, 2, 9}
        };
         
        int i,j;
        
        
        for(i=0; i < 3; i++){ 
            for(j=0; j < 5; j++){ 
                System.out.printf("[%d]", A[i][j]); 
                
            }
            System.out.print("\n"); //próxima linha
        }
        
        System.out.print("\n");
        
        for(i=0; i < 5; i++){ 
            for(j=0; j < 3; j++){ 
                System.out.printf("[%d]", A[j][i]); 
                
            }
            System.out.print("\n"); //próxima linha
        }
         
         
    }
    
}
