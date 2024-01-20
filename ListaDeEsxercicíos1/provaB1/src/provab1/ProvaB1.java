/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provab1;

import javax.swing.JOptionPane;
public class ProvaB1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int qtd[] = new int[5];
        float preco[] = new float [5];
        float PrecoMensal = 0;
        int pos = 0;
        
        for (int i = 0; i < qtd.length; i++){
            pos = i + 1;
            
            qtd[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de vendas do produto "+pos));
            
            preco[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Preço do produto "+pos));
            
            PrecoMensal += qtd[i] * preco[i];
        }
        
        JOptionPane.showMessageDialog(null, "As vendas mensais foram de R$"+PrecoMensal);
        
    }
    
}
