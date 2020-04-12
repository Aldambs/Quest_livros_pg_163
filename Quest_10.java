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
public class Quest_10 {

    /**
     * Faça um programa que carregue três vetores com dez números inteiros e um 
     * segundo vetor com cindo números inteiros. Calcule e mostre dois vetores 
     * resultantes. O primeiro vetor resultante será composto pelo número par do
     * primeiro vetor somado aos números do segundo vetor . O segundo vetor 
     * resultante será composto pela quantidade de divisores de cada número ímpar
     * do primeiro vetor pelo segundo vetor .
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Variaveis
        int vect1[] = new int[10];
        int vect2[] = new int[5];
        int vect3[] = new int[10];
        int vect4[] = new int[10];
        int aux = 0;
        
        //Comandos 
        for (int i = 0; i < 10; i++) {
            System.out.println(i+ "º valor: ");
            vect1[i] = ler.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println(i+ "º valor: ");
            vect2[i] = ler.nextInt();
        }
        
        //Exibir os comandos
        System.out.println("PRIMEIRO VETOR");
        for (int i = 0; i < 10; i++) {
            System.out.print(vect1[i]+ " ");
        }
        
        System.out.println("\nSEGUNDO VETOR");
        for (int i = 0; i < 5; i++) {
            System.out.print(vect1[i]+ " ");
        }
        
        //Atribuições de valores do primeiro vetor
        for (int i = 0; i < 10; i++) {
            if((vect1[i] % 2) == 0){
                vect3[i] = vect1[i] + aux;
            }
        }
        
        for (int i = 0; i < 5; i++) {
           aux = aux + vect2[i]; 
        }
        
        //Atribuições de valores do segundo vetor
        for (int i = 0; i < 10; i++) {
            if((vect1[i] % 2) == 1){
                for (int j = 0; j < 5; j++) {
                    if((vect1[i] % vect2[j]) == 0){
                        vect4[i] = vect4[i]+1;
                    }
                }
            }
        }
        
        //Resultado
        System.out.println("\nPrimeiro vetor");
        System.out.println("Soma de cada número par do primeiro vetor com todos do segundo.");
        for (int i = 0; i < 10; i++) {
            if(vect3[i] != 0){
                System.out.print(vect3[i]+" ");
            }
        }
        
        System.out.println("\nSegundo vetor");
        System.out.println("Quantidade de divisores que cada número ímpar no primeiro vetor tem no segundo vetor.");
        for (int i = 0; i < 5; i++) {
            if((vect2[i] % 2) == 1){
                System.out.print(vect2[i]+ " ");
            }
        }
    }
    
}
