/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01.númeroentre15e100;

import javax.swing.JOptionPane;
public class Ex01NúmeroEntre15e100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a integer number"));
        
        if (numero < 15 && numero < 100) {
            JOptionPane.showMessageDialog(null, "The number entered is not between 15 and 100");
        }else{
            JOptionPane.showMessageDialog(null, "The number entered is between 15 and 100");
        }
    }
    
}
