/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03.diasdasemana;

import javax.swing.JOptionPane;
public class Ex03DiasDaSemana {


    public static void main(String[] args) {
        int DayOfTheWeekInNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número da semana de 0 à 6"));
        
        /* Convertendo o número digitado no dia da semana, atráves do case*/
        switch (DayOfTheWeekInNumber) {
            case 0:
                JOptionPane.showMessageDialog(null, "Domingo");
                break; /* Usado para bloquear o comando */
                
            case 1:
                JOptionPane.showMessageDialog(null, "Segunda");
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null, "Terça");
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null, "Quarta");
                break;
                
            case 4:
                JOptionPane.showMessageDialog(null, "Quinta");
                break;
                
            case 5:
                JOptionPane.showMessageDialog(null, "Sexta");
                break;
                
            case 6:
                JOptionPane.showMessageDialog(null, "Sabádo");
                break;
        }
    }
}
