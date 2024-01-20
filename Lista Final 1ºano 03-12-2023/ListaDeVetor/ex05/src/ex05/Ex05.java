/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05;

import java.util.Scanner;

public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); 
        int Numeros[] = new int [20];
        int Impares[] = new int [20];
        int Pares[] = new int [20];
        
        int i;
                
        for(i = 0; i < Numeros.length; i++){
            
            System.out.printf("Digite o valor da %da posicao do vetor: ", (i+1));
            Numeros[i] = s.nextInt();
            
            if (Numeros[i] % 2 == 0){
                
                Pares[i] = Numeros[i];
                
            }else{
                
                Impares[i] = Numeros[i];
            }
  
        }
        
        System.out.print("\nVetor: ");
        for(i = 0; i < Numeros.length; i++){
            
            System.out.printf("[%d] ",Numeros[i]);  
            
        }
        
        System.out.print("\n");
        
        System.out.print("Pares: ");
        for(i = 0; i < Numeros.length; i++){
            
            if(Pares[i] != 0){
                
                System.out.printf("[%d] ",Pares[i]);  
                
            }
            
        }
        
        System.out.print("\n");
        
        System.out.print("Impares: ");
        for(i = 0; i < Numeros.length; i++){
            
            if(Impares[i] != 0){
                
                System.out.printf("[%d] ",Impares[i]);
                
            }           
            
        }
    }
    
}
