/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11;

/**
 *
 * @author Tiago e Diogo
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int MI[][] = new int [5][5]; //MATRIZ IDENTIDADE
        
        int i,j;
        
        for(i=0; i < MI.length; i++){
            for(j=0; j < MI.length; j++){
                
                if(i==j){
                    MI[i][j] = 1;
                }else{
                    MI[i][j] = 0;
                }
                
                System.out.printf(" {%d}", (MI[i][j])); 
                
            }
            System.out.println("\n");
        }
        
    }
    
}
