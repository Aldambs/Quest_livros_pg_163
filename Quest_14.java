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
public class Quest_14 {
    /*
    Faça um programa que receba o nome e duas notas de seis alunos emostre o 
    relatório abaixo:
    Relatório de notas:
    Aluno       1ª Prova     2ª Prova    3ª Prova   4ª Prova
    Carlos          8,0         9,0         8,5      Aprovado
    Pedro           4,0         5,0         4,5      Reprovado
   
    Média das classe = ??
    Quantidade de aprovados = ?%
    Quantidade de alunos de exames = ?%
    Quantidade de reprovados = ?%
    */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade de aluno: ");
        int qtd = ler.nextInt();
        String nome[] = new String[qtd];
        String situacao[] = new String[qtd];
        double not1[] = new double[qtd];
        double not2[] = new double[qtd];
        double med[] = new double[qtd];
        double contAP = 0, contRE = 0, contEX = 0;
        double medCl, soma = 0, porcAP, porcEX, porcRE;
        
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o nome do " +i+ "º aluno: ");
            nome[i] = ler.next();
            System.out.println("Digite a primeira nota do aluno: ");
            not1[i] = ler.nextDouble();
            System.out.println("Digite a segunda nota do aluno: ");
            not2[i] = ler.nextDouble();
            
            med[i] = (not1[i] + not2[i])/2;
            if(med[i] >= 7){
                situacao[i] = "Aprovado";
                contAP++;
            }else{
                if (med[i] > 5 & med[i] < 7) {
                    situacao[i] = "Exame";
                    contEX++;
                } else {
                    situacao[i] = "Reprovado";
                    contRE++;
                }
            }
            soma = soma + med[i];
        }
        medCl = soma/qtd;
        porcAP = (contAP/qtd)*100;
        porcEX = (contEX/qtd)*100;
        porcRE = (contRE/qtd)*100;
        
        System.out.println("============RELATÓRIO===================");
        System.out.println("|NOME | 1º NOTA | 2º NOTA | SITUAÇÃO|  ");
        System.out.println("========================================");
        
        for (int i = 0; i < qtd; i++) {
            System.out.println(nome[i]+ " | " +not1[i]+ " | " +not2[i]+ " | " +med[i]+ " | "+situacao[i]);
        }
        System.out.println("=========================================");
        System.out.println("Média da classe: " +medCl);
        System.out.println("Quantidade de aprovado: " +contAP+ " Porcentagem: " +porcAP+ "%");
        System.out.println("Quantidade de exames: " +contEX+ " Porcentagem: " +porcEX+ "%");
        System.out.println("Quantidade de reprovado: " +contRE+ " Porcentagem: " +porcRE+ "%");
        System.out.println("=========================================");
    }
    
}
