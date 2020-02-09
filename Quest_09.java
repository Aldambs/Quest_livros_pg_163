
package pg_163;

import java.util.Scanner;

public class Quest_09 {

    /**
     * Faça um programa que carregue três vetores com dez posições cada um. 
     * O primeiro vetor com os nomes de dez produtos. O segundo vetor com os 
     * códigos dos dez produtos. Mostre um relatório apenas com o nome, o código,
     * o preço e o novo preço dos produtos que sofrerão aumento. Sabe-se que os 
     * produtos que sofrerão aumento são aqueles que possuem código par ou preço 
     * superior a R$ 1.000,00. Sabe-se ainda que o produto satisfaz as duas 
     * condições acima (código e preço), o aumento de preço será de 20% se 
     * satisfaz apenas a condição de código; o aumento será de 15%; se satisfaz 
     * apenas a condição de preço, o aumento será de 10%.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade de produto:");
        int qtd = ler.nextInt();
        String nomeProd[] = new String[qtd];
        int codProd[] = new int[qtd];
        double precoProd[] = new double[qtd];
        double novoPreco[] = new double[qtd];
        
        for (int i = 1; i < qtd; i++) {
            System.out.println("Digite o código do " +i+ " produto: ");
            codProd[i] = ler.nextInt();
            System.out.println("Digite o nome do " +i+ " produto: ");
            nomeProd[i] = ler.next();
            System.out.println("Digite o preço do " +i+ " produto: ");
            precoProd[i] = ler.nextDouble();           
        }
        
        for (int i = 1; i < qtd; i++) {
            if(((codProd[i]/2 == 0)|| (precoProd[i] > 1000))
                    && ((codProd[i] / 2 == 0) & (precoProd[i] > 1000))){
                novoPreco[i] = precoProd[i] + precoProd[i] * 0.20;
                
            }else{
                if(codProd[i] / 2 == 0){
                    novoPreco[i] = precoProd[i] + precoProd[i] * 0.15;
                }else{
                    if(precoProd[i] > 1000){
                        novoPreco[i] = precoProd[i] + precoProd[i] * 0.10;
                    }
                }
            }
        }
        System.out.println("                     RELATÓRIO                      ");
        System.out.println("Código | Nome do Produto | Preço Antigo | Novo Preço");
        for (int i = 0; i < qtd; i++) {
            if(novoPreco[i] != 0){
                System.out.println(codProd[i]+ " -------- " +nomeProd[i]+ " -------- " +novoPreco[i]);
            }
        }
    }
    
}
