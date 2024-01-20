/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex08.reajusteproduto;

import javax.swing.JOptionPane;
public class Ex08ReajusteProduto {

    public static void main(String[] args) {
        
        /*Saving product information */
        float CurrentProductPrice = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the current product price"));
        float MonthlyProductSales = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the monthly product sales"));
        
        /*Calculating the new price*/
        if (MonthlyProductSales < 500 && CurrentProductPrice < 30){
            CurrentProductPrice = (float) (CurrentProductPrice * 0.10 + CurrentProductPrice);
        
        }else if (MonthlyProductSales >= 500 && MonthlyProductSales < 1000){
            CurrentProductPrice  = (float) (CurrentProductPrice * 0.15 + CurrentProductPrice);
            
        }
        
        /*Showing the new price*/
        JOptionPane.showMessageDialog(null, "The current product price is R$" + CurrentProductPrice + "\nAnd your monthly sales is " + MonthlyProductSales );
    }
    
}
