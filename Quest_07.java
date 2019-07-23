package pg_163;

import java.util.Scanner;

public class Quest_07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num[] = new double[10];
        double somaPos = 0;
        int qtdNeg = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o " +i+ "º número: ");
            num[i] = ler.nextDouble();
            if(num[i] < 0){
                qtdNeg = qtdNeg + 1;
            }else{
                somaPos = somaPos + num[i];
            }
        }
        System.out.println("A quantidade de números negativo é: " +qtdNeg);
        System.out.println("A soma dos números positivos é: " +somaPos);
    }
    
}
