/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10;


public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int MI[][] = new int[10][10];
        
        int contador = 1;        
        int i,j;
        int SmL5 = 0; //Soma Linha 5
        int SmC7 = 0; //Soma Coluna 7
        
        for (i = 0; i < MI.length; i++) {
            for (j = 0; j < MI.length; j++) {
                MI[i][j] = contador++;
                
                if(i==4){ //Soma da 5º linha
                    SmL5 += MI[i][j];
                }
                
                if(j==6){ //Soma da 7º coluna
                    SmC7 = MI[i][j];  
                }
            }
        }
        
        for(i=0; i < MI.length; i++){ //Varredura das linhas da matriz  
            for(j=0; j < MI.length; j++){ // Varredura das colunas da matriz

                System.out.printf(" {%d}", (MI[i][j])); 

            }  
            System.out.println("\n");
        }
        
        System.out.printf("""
                          Soma da 5a linha: %d 
                          Soma da 7a coluna: %d""",
                          SmL5, SmC7); 
        
    }
    
}
