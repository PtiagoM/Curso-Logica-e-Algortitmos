/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiotpa2;

import java.util.Scanner; //Importando a classe Scanner
public class DesafioTPA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.printf("-------------Manipulacao de Matrizes Quadradas-------------\n");
        
        
        //Criando a classe scanner
        Scanner s = new Scanner(System.in);  
        
        
        //Declarando váriaveis               
        int Dimensao; // Dimensão das matrizes quadradas
        int i, j, k; // Varredores
        int opcao; //Função escolhida pelo usuário
        float SomaDiagonalPrincipalA = 0, SomaDiagonalSecundariaA = 0, SomaDiagonalPrincipalB = 0, SomaDiagonalSecundariaB = 0; //Diagonais Inversa e Principal
        float ElementoMatrizMultiplicada; //Elemento resultante para Matriz C, da multiplicação entre matriz A e B.
        float NumeroReal; //Número real para multiplicar as matrizes

        
        //Definindo tamanho das matrizes
        System.out.print("Digite o tamanho das matrizes quadradas: ");
        Dimensao = s.nextInt();
        System.out.print("\n");
        
        
        //Declarando Matrizes
        float  A[][] = new float [Dimensao][Dimensao];
        float  B[][] = new float [Dimensao][Dimensao]; 
        
        
        
        //Lendo os valores da Matriz A
        System.out.println("-----------------1a. Matriz-----------------"); 
        
        for(i=0; i < A.length; i++){ //Varredura das linhas da matriz
            System.out.printf("Informe os elementos da %d a. linha:\n", (i + 1)); // Mostrando a linnha em que o usuárioestá digitando os valores da coluna
            
            for(j=0; j < A.length; j++){ // Varredura das colunas da matriz
                System.out.printf("A[%d][%d] = ", i, j); // Mostrando a posição que o valor inserido irá ocupar
                A[i][j] = s.nextFloat(); //Recebendo valor
                        
            }   
        }
        
        //Lendo os valores da Matriz B
        System.out.println("-----------------2a. Matriz-----------------");
        
        for (i=0; i<B.length; i++){
            System.out.printf("Informe os elementos da %da. linha:\n", (i + 1));

            for (j=0; j<B.length; j++){
                System.out.printf("B[%d][%d] = ", i, j);
                B[i][j] = s.nextFloat();
            }
        }
        System.out.print("\n");  // Dando espaço na linha

         // Mostrando as Matrizes
        System.out.println("Matriz A:    ");
        for(i=0; i < A.length; i++){ //Varredura das linhas da matriz  

            for(j=0; j < A.length; j++){ // Varredura das colunas da matriz

                System.out.printf("[%.1f] ", A[i][j]);

            }

            System.out.println("\n");
        }


        System.out.println("Matriz B:    ");
        for(i=0; i < B.length; i++){ //Varredura das linhas da matriz  

            for(j=0; j < B.length; j++){ // Varredura das colunas da matriz

                System.out.printf("[%.1f] ", B[i][j]);

            }

            System.out.println("\n");
        }       

        
        //Exibindo opções de exibição ao usuário
        do{
            
            //Pausa no algoritmo  
            System.out.println("\nDigite para continuar...");
            String pausa = s.next();
            
            System.out.println("""
                               Escolha uma das opcoes digitando seu numero:
                               (0) - Encerrar algoritmo
                               (1) - Exibir Diagonais e sua soma
                               (2) - Matriz Transposta
                               (3) - Matriz Inversa
                               (4) - Soma de Matriezes
                               (5) - Subtracao de Matriezes
                               (6) - Multiplicacao de Matriezes""");
            opcao = s.nextInt();
            
            switch (opcao){

                case 1 -> {
                    //Diagonais e sua soma
                    
                    //Diagonal Principal e Secundaria Matriz A
                    System.out.println("---Matriz A Diagonal Principal[] e Secundaria{}---");
                    
                    for(i=0; i < A.length; i++){ //Varredura das linhas da matriz

                        for(j=0; j < A.length; j++){ // Varredura das colunas da matriz

                            //Lógica Diagonal Principal
                            if(i == j){
                                                            
                                if (i == j && i + j == Dimensao - 1){
                                    
                                    System.out.printf("[{%.1f}]", A[i][j]); //Elemento atende as duas condições
                                    
                                    SomaDiagonalSecundariaA += A[i][j]; //Caso exita elementos iguais nas diagonais, o somando na secundária também
                                                                          
                                }else{
                                    System.out.printf(" [%.1f]", A[i][j]);
                                }
                                
                                SomaDiagonalPrincipalA += A[i][j]; //Somando os elementos da diagonal principal
                                
                                //Lógica Diagonal Inversa
                            }else if(i + j == Dimensao - 1){
                                
                                System.out.printf(" {%.1f}", A[i][j]); 
                                
                                SomaDiagonalSecundariaA += A[i][j];
                                
                                //Fins de formatação no texto    
                            }else{
                                
                                System.out.printf("     ");
                                
                            }
                                  
                        }
                        System.out.println("\n");
                    }
                     
                    
                    System.out.printf("""
                                      -----Soma das Diagonais A-----
                                      Diagonal Principal: %.1f
                                      Diagonal Secundaria: %.1f
                                      Soma das Diagonais: %.1f""" 
                                  ,SomaDiagonalPrincipalA, SomaDiagonalSecundariaA, (SomaDiagonalPrincipalA + SomaDiagonalSecundariaA));
                    
           
                    System.out.println("\n");
                    System.out.println("\nDigite para ver a B...");
                    pausa = s.next();
                    
                    
                    //Diagonal Principal e Secundaria Matriz B
                    System.out.println("---Matriz B Diagonal Principal[] e Secundaria{}---");
                    
                    for(i=0; i < B.length; i++){ //Varredura das linhas da matriz

                        for(j=0; j < B.length; j++){ // Varredura das colunas da matriz

                            //Lógica Diagonal Principal
                            if(i == j){
                                                            
                                if (i == j && i + j == Dimensao - 1){
                                    
                                    System.out.printf("[{%.1f}]", B[i][j]); //Elemento atende as duas condições
                                    
                                    SomaDiagonalSecundariaB += B[i][j]; //Caso exita elementos iguais nas diagonais, o somando na secundaria também
                                                                          
                                }else{
                                    System.out.printf(" [%.1f]", B[i][j]);
                                }
                                
                                SomaDiagonalPrincipalB += B[i][j]; //Somando os elementos da diagonal principal
                                
                                //Lógica Diagonal Secundaria
                            }else if(i + j == Dimensao - 1){
                                
                                System.out.printf(" {%.1f}", B[i][j]); 
                                
                                SomaDiagonalSecundariaB += B[i][j];
                                
                                //Fins de formatação no texto    
                            }else{
                                
                                System.out.printf("     ");
                                
                            }
                                  
                        }
                        System.out.println("\n");
                    }
                    
                    System.out.printf("""
                                      -----Soma das Diagonais B-----
                                      Diagonal Principal: %.1f
                                      Diagonal Secundaria: %.1f
                                      Soma das Diagonais: %.1f""" 
                                  ,SomaDiagonalPrincipalB, SomaDiagonalSecundariaB, (SomaDiagonalPrincipalB + SomaDiagonalSecundariaB));
                    
                      System.out.println("\n");
                }

                case 2 -> { //Matriz trasnposta
                    
                    System.out.println("-----Matriz Trasnposta A:------");
                    for(i=0; i < A.length; i++){ //Varredura das linhas da matriz  
                        for(j=0; j < A.length; j++){ // Varredura das colunas da matriz
                           
                            System.out.printf(" {%.1f}", A[j][i]);

                        }
                        System.out.println("\n");
                        
                    }
                    
                    System.out.println("-----Matriz Trasnposta B:------");
                    for(i=0; i < B.length; i++){ //Varredura das linhas da matriz  
                        for(j=0; j < B.length; j++){ // Varredura das colunas da matriz
                           
                            System.out.printf(" {%.1f}", B[j][i]);

                        }
                        System.out.println("\n");
                        
                    }
                       
                }
     

                case 3 -> { //Matriz Inversa
                    
                    System.out.println("-----Matriz Inversa A------");
                    for(i=0; i < A.length; i++){ //Varredura das linhas da matriz  
                        for(j=0; j < A.length; j++){ // Varredura das colunas da matriz
                           
                            System.out.printf(" {%.2f}", ( Math.pow(A[i][j], -1)));

                        }
                        System.out.println("\n");
                        
                    }
                    
                    System.out.println("-----Matriz Inversa B------");
                    for(i=0; i < B.length; i++){ //Varredura das linhas da matriz  
                        for(j=0; j < B.length; j++){ // Varredura das colunas da matriz
                           
                            System.out.printf(" {%.2f}", ( Math.pow(B[i][j], -1)));

                        }
                        System.out.println("\n");
                        
                    }
                }

                case 4 -> { //Soma de matrizes
                    
                    System.out.println("-----Soma de Matrizes A + B------");
                    for(i=0; i < A.length; i++){ //Varredura das linhas da matriz  
                        for(j=0; j < A.length; j++){ // Varredura das colunas da matriz
                           
                            System.out.printf(" {%.1f}", (A[i][j] + B[i][j]));

                        }
                        System.out.println("\n");
                        
                    }
                    
                }


                case 5 -> {//Subtração de matrizes
                    
                    System.out.println("-----Subtracao de Matrizes A - B------");
                    for(i=0; i < A.length; i++){ //Varredura das linhas da matriz  
                        for(j=0; j < A.length; j++){ // Varredura das colunas da matriz
                           
                            System.out.printf(" {%.1f}", (A[i][j] - B[i][j]));

                        }
                        System.out.println("\n");
                        
                    }
                    
                }


                case 6 -> { // Multiplicação de Matrizes
                    
                    System.out.println("-----Multiplicacao de Matrizes-----");
                    
                    System.out.println("""
                               Escolha uma das opcoes:
                               (1) - Multiplicacao das Matrizes por numero real
                               (2) - Multiplicacao entre as Matrizes""");
                    opcao = s.nextInt();
                    
                    
                    switch (opcao){
                        
                        case 1 -> { // Multiplicação por número real
                            
                            System.out.println("Insira o numero real:");
                            NumeroReal = s.nextFloat();
                            
                            
                            System.out.printf("-----Matriz A por %.1f------\n", NumeroReal);
                            
                            for(i=0; i < A.length; i++){ //Matriz A
                                for(j=0; j < A.length; j++){
                                    
                                    System.out.printf("{%.1f}", A[i][j] * NumeroReal);
                                    
                                }
                                System.out.println("\n");
                                
                            }
                            
                            System.out.printf("-----Matriz B por %.1f------\n", NumeroReal);
                            
                            for(i=0; i < B.length; i++){ //Matriz B
                                for(j=0; j < B.length; j++){
                                    
                                    System.out.printf("{%.1f}", B[i][j] * NumeroReal);
                                    
                                }
                                System.out.println("\n");
                                
                            }
                            
                        }
                        
                        case 2 -> { // Multiplicação entre matrizes
                            
                            System.out.println("-----Multiplicacao de Matrizes A x B------");
                            
                            for(i=0; i < A.length; i++){ //Varredura das linhas da matriz  
                                for(j=0; j < A.length; j++){ // Varredura das colunas da matriz

                                    ElementoMatrizMultiplicada = 0; //Reiniciando o resultado
                                    
                                    for(k=0; k < B.length; k++){ //Rodando as linhs da Matriz B mantendo a caluna, e colunas da Matriz A mantendo a linha

                                        ElementoMatrizMultiplicada += A[i][k] * B[k][j]; //Lógica multipliação entre matrizes
                                    }
                                    System.out.printf(" {%.1f}", ElementoMatrizMultiplicada); //exibindo valor

                                }
                                System.out.println("\n");
                                
                            }    
                        }            
                    }   
                }
                
  
                
            }
            
        }while(opcao != 0);
    }
}