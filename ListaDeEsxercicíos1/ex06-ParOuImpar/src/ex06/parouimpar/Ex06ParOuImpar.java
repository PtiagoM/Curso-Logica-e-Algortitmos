/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06.parouimpar;

import javax.swing.JOptionPane;
public class Ex06ParOuImpar {

    
    public static void main(String[] args) {
        
        /*Save the number*/
        int NumberEvenOrOdd = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
        
        /*Checking if the number is a even or odd*/
        if (NumberEvenOrOdd % 2 == 0) {
            JOptionPane.showMessageDialog(null,"The number entered is even");
        }else{
            JOptionPane.showMessageDialog(null, "The number entered is odd");
        }
    }
    
}
