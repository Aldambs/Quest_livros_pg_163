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
public class Quest_11 {

    /**
      Faça um programa que receba dez números inteiros e armazene-os em um vetor.
      Calcule e mostre dois vetores resultantes. O primeiro com os números pares 
      e o segundo com os ímpares.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade:");
        int qtd = ler.nextInt();
        int num[] = new int[qtd];
        int vetp[] = new int[qtd];
        int veti[] = new int[qtd];
        int contp = 0, conti = 0;
        
        //Seção de comandos
        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe os números: ");
            num[i] = ler.nextInt();
        }
        for (int i = 0; i < qtd; i++) {
            if ((num[i] % 2) == 0) {
                vetp[contp] = num[i];
                contp++;
            }else{
                veti[conti] = num[i];
                conti++;
            }
        }
        
        //Imprimir Resultado
        System.out.println("Números pares");
        for (int i = 0; i < contp; i++) {
            System.out.print(vetp[i]+ " ");
        }
        System.out.println("\nNúmeros impares");
        for (int i = 0; i < conti; i++) {
            System.out.print(veti[i]+ " ");
        }
    }
    
}
