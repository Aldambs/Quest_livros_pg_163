package pg_163;

import java.util.Scanner;

public class Quest_03 {
    /**
     Faça um programa para controlar o estoque de mercadorias de uma empresa. 
     Inicialmente o programa deverá ler dois vetores com dez posições cada, onde 
     o primeiro corresponde ao código do produto e o segundo corresponde ao total
     desse produto em estoque. Logo após, o programa deverá ler um conjunto 
     indeterminado de dados contendo o código de um cliente, o código do produto
     que este deseja comprar juntamente com a quantidade . Código do cliente 
     igual a zero indica fim do programa. O programa deverá verificar:
    •se o código do produto solicitado existe. Se existir, tentar atender o pedido; 
    caso contrário, exibir mensagem Código Inexistente.
    •Cada pedido feito por um cliente só pode ser atendido integralmente. 
    Caso isso não seja possível, escrever a mensagem Não temos estoque suficiente 
    dessa mercadoria. Se puder atende-lo, escrever a mensagem Pedido atendido.
    Obrigado e volte sempre;
    •efetuar a atualização do estoque somente se o pedido for atendido integralmente ;
    •no final do programa, escrever os códigos dos produtos com seus respectivos 
    estoques já atualizados.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade de produtos: ");
        int qtd = ler.nextInt();
        int codProd[] = new int[qtd];
        int qtdp[] = new int[qtd];
        int codCli, codp, i;
        boolean prod;
        
        for (i = 0; i < qtd; i++) {
            System.out.println("Digite o código do " +i+ "º produto: ");
            codProd[i] = ler.nextInt();
            System.out.println("Digite a quantidade do " +i+ "º produto: ");
            qtdp[i] = ler.nextInt();
        }
        System.out.println("Informe o código do cliente: ");
        codCli = ler.nextInt();
        do {
            System.out.println("Digite o código do produto desejado: ");
            codp = ler.nextInt();
            for (i = 0; i < qtd; i++) {
                if (codProd[i] == codp) {
                    prod = true;
                }
            }
            if(prod = true){
                System.out.println("Informe a quantidade desejada: ");
                qtd = ler.nextInt();
                if(qtdp.length >= qtd){
                    qtd = qtdp.length -1;
                    System.out.println("Produto atendido. Volte sempre!");
                }else{
                    System.out.println("Infelizmente não podemos atender seu pedido"); 
                    System.out.println("Não temos estoque suficiente desta mercadoria");       
                }
            }else{
                System.out.println(" CÓDIGO INEXISTENTE ");
            }
            System.out.println("Para sair digite zero");
            System.out.println("Informe o código do cliente: ");
            codCli = ler.nextInt();
        } while (codCli != 0);
        for (int j = 0; j < qtd; j++) {
            System.out.println("O código do produto é: "+codProd[j]);
            System.out.println("A quantidade no estoque atualizada é: "+qtdp[j]);
        }
    }
    
}
