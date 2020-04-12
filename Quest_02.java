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
public class Quest_02 {

    /**
     Faça um programa que carregue um vetor com sete números inteiros, 
     calcule e mostre:
    •os números múltiplos de 2;
    •os números múltiplos de 3;
    •os números múltiplos de 2 e de 3.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num[] = new int[7];
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Informe os números: ");
            num[i] = ler.nextInt();
        }
        System.out.print("Multiplos de 2: ");
        for (int i = 0; i < 7; i++) {
            if(num[i] % 2 == 0){             
                System.out.print(num[i]+ " ");
            }          
        }
        
        System.out.print("\nMultiplos de 3: ");
        for (int i = 0; i < 7; i++) {
            if(num[i] % 3 == 0){             
                System.out.print(num[i]+ " ");
            }          
        }
        System.out.print("\nMultiplos de 2 e de 3: ");
        for (int i = 0; i < 7; i++) {
            if((num[i] % 2 == 0) && (num[i] % 3 == 0)){             
                System.out.print(num[i]+ " ");
            }          
        }
        
    }
    
}
