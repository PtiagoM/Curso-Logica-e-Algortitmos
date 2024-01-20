/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5.maioroumenor;

import javax.swing.JOptionPane;
public class Ex5MaiorOuMenor {

    
    public static void main(String[] args) {
        
        int TopCandidated = 0;
        
        /*Saving the numbers*/
        int CandidatedForGreaterNumber1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a first number"));   
        int CandidatedForGreaterNumber2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a  second number"));
        int CandidatedForGreaterNumber3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a third number"));
        
        /*Finding the biggest number*/
        if (CandidatedForGreaterNumber1 > CandidatedForGreaterNumber2 && CandidatedForGreaterNumber1 > CandidatedForGreaterNumber3) {
            TopCandidated = CandidatedForGreaterNumber1;
            
        }else if (CandidatedForGreaterNumber2 > CandidatedForGreaterNumber1 && CandidatedForGreaterNumber2 > CandidatedForGreaterNumber3){
            TopCandidated = CandidatedForGreaterNumber2;
            
        }else{
            TopCandidated = CandidatedForGreaterNumber3;
        }
        
        JOptionPane.showMessageDialog(null, "The largest number entered " + TopCandidated);
    }
    
}
