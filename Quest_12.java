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
public class Quest_12 {
    /*
    Faça um programa que receba cinco números e mostre a saída a seguir:
    Digite o 1º número 5
    Digite o 2º número 3
    Digite o 3º número 2
    Digite o 4º número 0
    Digite o 5º número 2
    Os números digitados foram: 5 + 3 + 2 + 0 + 2 = 12
    */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num[] = new int[5];
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o " +i+ "º número:");
            num[i] = ler.nextInt();
            soma = soma + num[i];
        }

        System.out.println("Informe os números digitados: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(num[i]+ " ");
        }
        System.out.println("\nA soma = " +soma); 
    }
    
}
