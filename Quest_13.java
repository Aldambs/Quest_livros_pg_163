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
public class Quest_13 {
    /*
    Faça um programa que receba o nome e a nota de oito alunos e mostre o relatório
    a seguir:
    Digite o nome do 1º aluno Carlos
    Digite a nota do Carlos 8
    Digite o nome dos do segundo aluno Pedro
    Digite a nota do Pedro 5
    
    Relatórios de notas
    Aluno Nota
    Carlos 8.0
    Pedro 5.0
    ..
    Média da classe = ??
    */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome[] = new String[4];
        double nota[] = new double[4];
        double media = 0, soma = 0;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o nome do aluno:");
            nome[i] = ler.next();
            System.out.println("Digite a nota do aluno");
            nota[i] = ler.nextDouble();
            soma = soma + nota[i];
            media = soma / 4;
        }
        
        System.out.println("==============RELATÓRIO=================");
        System.out.println("NOME  =  NOTA");
        System.out.println("========================================");
        for (int i = 0; i < 4; i++) {
            System.out.println(nome[i]+ " = " +nota[i]);
        }
        System.out.println("========================================");
        System.out.println("MÉDIA DA CLASSE: " +media);
        System.out.println("========================================");
    }
    
}
