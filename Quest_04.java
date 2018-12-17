package pg_163;

import java.util.Scanner;

public class Quest_04 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vt[] = new int[15];
        int ip[] = new int[15];
        int cont = 0;
        for (int i = 0; i < 15; i++) {
            System.out.print("Entre com o " +i+ " elemento do vetor: ");
            vt[i] = ler.nextInt();
            if(vt[i] == 30){
                ip[cont] = i;
                cont++;
            }
        }
        for (int i = 0; i < cont; i++) {
            System.out.print(ip[i]);
        }
    }
    
}
