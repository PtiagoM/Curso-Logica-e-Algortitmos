/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06;

import java.util.Scanner;

public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int dimensao; //usuário determinará a dimensão da matriz
        int i,j; //varredoes  
        
        System.out.print("Insira a dimensao da matriz quadrada: ");
        dimensao = ler.nextInt();
        
        String MA[][] = new String [dimensao][dimensao];
        
        for(i=0; i < MA.length; i++){ 
            for(j=0; j < MA.length; j++){
                
                MA[i][j] = "* ";
                System.out.print(MA[i][j]); // Exibindo figura completa
            }
            System.out.print("\n"); //pulando linha
        }
        
         System.out.println("\n"); //pulando linha
        
        for(i=0; i < MA.length; i++){ 
            for(j=0; j < MA.length; j++){
                
                if( (i != 0) && (j != 0) && (i != MA.length - 1) && (j != MA.length - 1) ){
                    System.out.print("  ");
                }else{
                    System.out.print(MA[i][j]); // Exibindo Matriz sem o centro
                }
            }
            System.out.print("\n"); //pulando linha
        }
        
        System.out.println("\n"); //pulando linha
        
        for(i=0; i < MA.length; i++){ 
            for(j=0; j < MA.length; j++){
                
                if(i > j || i == j){
                    System.out.print(MA[i][j]); // Exibindo trapézio inferior direito da Matriz
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n"); //pulando linha
        }
    }
    
}
