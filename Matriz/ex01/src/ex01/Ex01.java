/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01;

        
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        int i,j; // Criando varredores
        
        // Criando e atribuindo os valores na matriz de LETRAS
        String LE[][]  = { 
                {"a", "b", "c", "d", "e"},
                {"f", "g", "h", "i", "j"},
                {"l", "m", "n", "o", "p"},
                {"q", "r", "s", "t", "u"}
        };
        
        // Criando e atribuindo os valores na matriz INTEIRA
        int IN[][] = {
                {19, 25, 100},
                {99, 10, 7},
                {25, 14, 35},
                {2, 47, 74}
        };

        // Criando e atribuindo os valores na Matriz DECIMAL
        double DE[][] = {
                {1.9, 2.5, 10.0},
                {1.0, 7.8, 2.5},
                {3.5, 2.2, 4.7}
        };
        
        for (i = 0; i < 4; i++){ // Varrendo as linhas da matriz de acordo com seu número de linhas (4)
            for (j = 0; j < 5; j++){ // Varrendo as colunas da matriz de acordo com seu número de 
                
                System.out.print("["+ LE[i][j] +"]");
                
            }
            
            System.out.print("\n"); // passando pra próxima linha
        }
        
        System.out.print("\n");
        
        for (i = 0; i < 4; i++){ 
            for (j = 0; j < 3; j++){ 
                
                System.out.print("["+ IN[i][j] +"]");
                
            }
            
            System.out.print("\n"); 
        }
        
        System.out.print("\n");   
        
         for (i = 0; i < DE.length; i++){ 
            for (j = 0; j < DE.length; j++){ 
                
                System.out.print("["+ DE[i][j] +"]");
                
            }
            
            System.out.print("\n"); 
        }
        
    }
    
}
