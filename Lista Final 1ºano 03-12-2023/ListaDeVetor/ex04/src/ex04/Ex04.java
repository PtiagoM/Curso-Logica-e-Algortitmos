/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04;

import java.util.Scanner;

/**
 *
 * @author Tiago e Diogo
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String Caracteres[] = new String[10];
        String vogais = "aeiou";
        String consoantes = "";
        int i, QtdConsoantes = 0;
        
        for(i = 0; i < Caracteres.length; i++){
            
            System.out.printf("Digite o caractere da %da posicao do vetor: ", (i+1));
            Caracteres[i] = s.next();
            
            // Verifica se o caractere não está presente na string de vogais
            if (!vogais.contains(Caracteres[i])){
                consoantes += Caracteres[i] + " ";
                QtdConsoantes++;
            }
            
        }
        
        System.out.printf("\nA quantidade de consoantes digitadas foi %d, elas sao: %s", QtdConsoantes, consoantes);
        
    }
    
}
