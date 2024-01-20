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
        
        Scanner s = new Scanner(System.in);
        
        String Nome;
        String NomesAprovados[] = new String[2];   
        float Media[] = new float [NomesAprovados.length];
        
        int i, j, k = 0, QtdAprovados = 0;
        float mediaTemp = 0;
        
        
        for(i = 0; i < NomesAprovados.length; i++){
            
            System.out.println("Digite o nome do aluno:");
            Nome = s.next();
            
            for(j=0; j < 4; j++){
                System.out.printf("Digite a %da nota do aluno %s: \n", (j+1), Nome);
                mediaTemp += s.nextFloat();
            }
            
            mediaTemp = mediaTemp / 4;
            
            if (mediaTemp > 7){                    
                NomesAprovados[k] = Nome;
                Media[k] = mediaTemp;
                QtdAprovados++;
                k++;
            }
            
            mediaTemp = 0;
        }
        
        System.out.println("\n-----ALUNOS APROVADOS----");
        
        for (i = 0; i < QtdAprovados; i++){
            
            System.out.printf("%s: %.1f; \n", NomesAprovados[i], Media[i]);
        }
        
        System.out.println("\nTotal de aprovados: " + QtdAprovados);
    }
    
}
