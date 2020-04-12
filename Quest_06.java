package pg_163;

import java.util.Scanner;

public class Quest_06 {
    /*
    Faça um programa que receba o total das vendas de cada vendedor e armazene-as 
    em um vetor. Receba também o percentual de comissão de cada vendedor a 
    armazene-os em outro vetor. Receba os nomes desses vendedores e armazene-os
    em um terceiro vetor. Existem apenas dez vendedores. Calcule e mostre:
    
    um relatório com os nomes dos vendedores;
    o total das vendas de todos os vendedores;
    o maior valor a receber e quem o receberá;
    o menor valor a receber e quem o receberá.
    */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o número de vendedores: ");
        int num = ler.nextInt();
        String nomeVendendor[] = new String[num];
        int totalVendas[] = new int[num];
        double comissao[] = new double[num];
        double valor[] = new double[num];
        String maiorReceber, menorReceber;
        int totalVenda = 0;
        double menorValor, maiorValor;
        
        for (int i = 0; i < num; i++) {
            System.out.println("Qual o nome do vendedor: ");
            nomeVendendor[i] = ler.next();
            System.out.println("Qual o valor total da venda:");
            totalVendas[i]= ler.nextInt();
            System.out.println("Qual a porcentagem de comissão do vendedor:");
            comissao[i] = ler.nextDouble();
        }
        System.out.println("Nome do vendendor   R$ = Comissão");
        for (int j = 0; j < num; j++) {
            System.out.println(nomeVendendor[j] +  "  R$ " + totalVendas[j]*(comissao[j] /100));
            valor[j] = totalVendas[j] * (comissao[j]/100); 
        }
        for (int k = 0; k < num; k++) {
            totalVenda = totalVenda + totalVendas[k];
        }
        System.out.println("Total de vendas: " +totalVenda);
         
        maiorReceber = nomeVendendor[1];
        menorReceber = nomeVendendor[1];
        maiorValor = valor[1];
        menorValor = valor[1];
        
        for (int i = 0; i < num; i++) {
            if(valor[i] > maiorValor){
                maiorValor = valor[i];
                maiorReceber = nomeVendendor[i];
            }else if(valor[i] < menorValor){
                menorValor = valor[i];
                menorReceber = nomeVendendor[i];
            }
        }
        System.out.println("O maior valor a receber: " +maiorReceber+ " , " +maiorValor);
        System.out.println("O menor valor a receber: " +menorReceber+ " , " +menorValor);
    }
    
}
