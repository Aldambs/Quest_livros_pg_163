package pg_163;

import java.util.Scanner;

public class Quest_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vt[] = new int[6];
        int par[] = new int[6];
        int impar[] = new int[6];
        int qtdp = 0, qtdi = 0;
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Entre com o " + i + "º elemento do vetor: ");
            vt[i] = ler.nextInt();
            if (vt[i] % 2 == 0) {
                par[qtdp] = vt[i];
                qtdp++;
            }
            if (vt[i] % 2 == 1) {
                impar[qtdi] = vt[i];
                qtdi++;
            }
        }
        System.out.println("Quantidade de pares: " + qtdp);
        for (int i = 0; i < qtdp; i++) {
            System.out.print(par[i]+ " ");
        }
        
        System.out.println("\nQuantidade de impares: " + qtdi);
        for (int i = 0; i < qtdi; i++) {
            System.out.print(impar[i]+ " ");
        }
    }

}
