/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provab2;

import javax.swing.JOptionPane;
public class ProvaB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A[] = new int [10];
        int soma = 0;
        int pos = 0;
        
        for (int i = 0; i < A.length; i++){
            pos = i + 1;
            
            A[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor " + pos)); 
        }
        
        for (int i = 0; i < A.length; i++){
            soma = (A[i] - A[21 - i]) ^ 2;  
        }
        JOptionPane.showMessageDialog(null, "Somatória: "+ soma);
    }
    
}
