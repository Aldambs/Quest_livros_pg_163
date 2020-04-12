/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg_163;

import java.util.Scanner;

/**
 *
 * @author aldam
 */
public class Quest_15 {
    /*
    Faça um programa que receba o nome de oito clientes e armazene-os em um vetor. 
    Em um segundo vetor armazene a quantidade de fitas locadas em 1999 por um dos
    oito clientes. Sabe-se que para cada dez locações o cliente tem direito a um
    locação grátis. Faça um programa que mostre o nome de todos os clientes com 
    a quantidade de locações grátis a que ele tem direito.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner imput = new Scanner(System.in);
        System.out.println("Informe a quantidade de cliente: ");
        int qtd = imput.nextInt();
        String nome[] = new String[qtd];
        int qtdLoc[] = new int[qtd];
        int qtdGr[] = new int[qtd];
        
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o nome do cliente: ");
            nome[i] = imput.next();
            System.out.println("Digite a quantidade de fita locada: ");
            qtdLoc[i] = imput.nextInt();
        }
        System.out.println("Nome ||  Qtd Locada   ||  Qtd Gratis");
        for (int i = 0; i < qtd; i++) {
            qtdGr[i] = qtdLoc[i]/10;
            System.out.println(nome[i]+ " || " +qtdLoc[i]+ " || " +qtdGr[i]);
        }
    }
    
}
