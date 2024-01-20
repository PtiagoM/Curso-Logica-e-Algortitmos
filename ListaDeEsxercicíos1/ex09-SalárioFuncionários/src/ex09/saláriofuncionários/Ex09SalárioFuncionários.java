/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex09.saláriofuncionários;

import javax.swing.JOptionPane;
public class Ex09SalárioFuncionários {

    
    public static void main(String[] args) {
        
        /*Declaring variables*/
        float GrossSalary, NetSalary = 0, DiscountSalary = 0, AvarageWage = 0;
        int NumberOfEmployees = 0;
        String FinalTable = "";
        
        
        for (int i=1; i < 6; i++){ /*Saving employee data */ 
            
            GrossSalary = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the employee is gross salary"));
            NumberOfEmployees = i; 
            
            /*Calculating the Discount Salary*/
            if (GrossSalary <= 300) {
                
                DiscountSalary = 0;
                NetSalary = GrossSalary;
            
            }else if (GrossSalary > 300 && GrossSalary <= 800) {
                
                DiscountSalary = (float) 5;
                NetSalary = (float) (GrossSalary - (GrossSalary * (DiscountSalary / 100)));
                
            }else if (GrossSalary > 900 && GrossSalary <= 1200) {
                
                DiscountSalary = (float) 10;
                NetSalary = (float) (GrossSalary - (GrossSalary * (DiscountSalary / 100)));
                
            }else if (GrossSalary > 1200) {
                
                DiscountSalary = (float) 15;
                NetSalary = (float) (GrossSalary - (GrossSalary * (DiscountSalary / 100)));
            }
            
            /*Calculating the avarage wage*/
            AvarageWage = GrossSalary + AvarageWage;
            if (i == 5){
                AvarageWage = AvarageWage / 5;
            }
            
            
            /*Saving and organizing values*/
            String StringDataNumberOfEmployees = Integer.toString(NumberOfEmployees );
                    
            String StringGrossSalary = Float.toString(GrossSalary);
            String StringNetSalary = Float.toString(NetSalary);
            String StringDiscountSalary = Float.toString(DiscountSalary);
            FinalTable = FinalTable + "\n    "
                        +StringDataNumberOfEmployees+"          /        R$"
                        +StringGrossSalary+"     /        "
                        +StringDiscountSalary+"%   /  R$"
                        +StringNetSalary + "\n";
        }
        
        /*showing result*/
        JOptionPane.showMessageDialog(null, "Employees"
                + " / Gross Salary / Discount / Net Salary \n"
                                                        + FinalTable 
                                                        + "\nAvarage Wage: " + AvarageWage);
    }
    
}
