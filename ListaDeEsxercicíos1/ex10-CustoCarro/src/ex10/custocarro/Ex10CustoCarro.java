/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10.custocarro;

import javax.swing.JOptionPane;
public class Ex10CustoCarro {

    
    public static void main(String[] args) {
        
        /*Recebendo o custo de produção*/
        float CustoDeFabrica = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe  o custo de produção do produto"));
        
        /*Calculando o custo ao consumidor*/
        float CustoAoConsumidor = (float) (CustoDeFabrica + (CustoDeFabrica * 0.28) + (CustoDeFabrica * 0.45));
        
        /*Calculando valor final
        */
        JOptionPane.showMessageDialog(null, "O valor final ao consumidor do carro é de R$" + CustoAoConsumidor);
        
    }
    
}
