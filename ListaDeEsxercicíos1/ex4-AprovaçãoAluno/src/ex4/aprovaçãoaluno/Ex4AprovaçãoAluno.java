/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4.aprovaçãoaluno;

import javax.swing.JOptionPane;
public class Ex4AprovaçãoAluno {


    public static void main(String[] args) {
        /*Saving studant grades*/
        float score1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Write the value of first grade"));
        float score2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Write the value of second grade"));
        float score3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Write the value of third grade"));
        float score4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Write the value of fourth grade"));
        
       /*Calculating the average*/
       float media = (score1 + score2 + score3 + score4) / 4;
       
       /*Checking status*/
       String status = "";
       if (media >= 6) {
           status = "APROVADO";
           
       }else if (media < 3){
           status = "RETIDO";
           
       }else if (media >= 3 && media < 6){
           status = "EXAME";
       }
       
       /*Showing results*/
       JOptionPane.showMessageDialog(null, "The avarge of the studant is " + media + "\nSTATUS: " + status);
       
    }
    
}
