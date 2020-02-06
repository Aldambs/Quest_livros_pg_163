/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg_163;

import java.util.Scanner;

/**
 *
 * @author Alda Matos
 */
public class Quest_08 {

    /*
     *Faça um programa que carregue um vetor com os nomes de sete alunos. Carregue
     * um outro vetor com a média final desses alunos. Calcule e mostre:
     * O nome do aluno com maior média (desconsiderar empates);
     * Para cada aluno não aprovado, isto é, com média menor que 7, mostrar quanto 
     * esse aluno precisa tirar na prova de exame final para ser aprovado.considerar 
     * que a média para aprovação no exame é 5.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade de alunos: ");
        int qtd = ler.nextInt();
        String nome[] = new String[qtd], nomeMed = null;
        double media[] = new double[qtd], aux = 0, maior = 0, nota;
        
        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe o " +i+ "º nome: ");
            nome[i] = ler.next();
            System.out.println("Informe a " +i+ "º média: ");
            media[i] = ler.nextDouble();          
            
            if(media[i] > maior){
                maior = media[i];
                aux = maior;
                nomeMed = nome[i];
            }
        }
        System.out.println("Nome do Aluno: " +nomeMed+ " \nMédia: " +aux);
        
        for (int i = 0; i < qtd; i++) {
            if(media[i] < 7){
                nota = 10 - media[i];
                System.out.println("O aluno: " +nome[i]+ ", tirou média final: " +media[i]);
                System.out.println("Para ser aprovado precisa - se de: " +nota);
            }
        }
    }
    
}
