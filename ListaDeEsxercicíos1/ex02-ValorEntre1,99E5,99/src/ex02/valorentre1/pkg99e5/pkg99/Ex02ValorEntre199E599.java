/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02.valorentre1.pkg99e5.pkg99;

import javax.swing.JOptionPane;
public class Ex02ValorEntre199E599 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numero = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter a real number"));
            
            if (numero > 1.99 && numero < 5.99){
                JOptionPane.showMessageDialog(null, "The number entered is between 1.99 and 5.99");
            }else{
                JOptionPane.showMessageDialog(null, "The number entered is not beteween 1.99 and 5.99");
            }          
    }
}
