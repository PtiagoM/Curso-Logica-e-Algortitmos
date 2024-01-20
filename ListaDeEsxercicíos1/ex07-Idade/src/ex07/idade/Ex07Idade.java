/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex07.idade;

import javax.swing.JOptionPane;
public class Ex07Idade {
    

   
    public static void main(String[] args) {
        
        /*Checking the decade of bitrh*/
        int YearOld = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your decade of birth (AA)"));
        
        /*Checking if the number is greater than 2000*/
        int age = 0;
        
        if (YearOld < 23) {
            age = 23 - YearOld;
            
        }else if (YearOld >= 53) {
            age = 123 - YearOld;
        }
        
        /*Checking if age is greater than 70*/
        if (age < 71 && age != 0) {
            JOptionPane.showMessageDialog(null,"Your age is " + age);
            
        }else{
            JOptionPane.showMessageDialog(null, "Invalid age");
        }
    }
    
}
