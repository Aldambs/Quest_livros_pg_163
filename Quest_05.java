package pg_163;

import java.util.Scanner;

public class Quest_05 {
    /*
    Uma escola deseja saber se existem alunos cursando, simultaneamente, as 
    disciplina Lógica e Linguagem de programação. Coloque os números das matrículas 
    dos alunos que cursam Lógica em um vetor, no máximo 15 alunos. Coloque os 
    números das matrículas dos alunos que cursam Linguagem de programação em outro 
    vetor, no máximo dez. Mostre o número da matrícula que aparece nos dois vetores.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int l[] = new int[15];
        int lp[] = new int[10];
        int i, j;

        for (i = 0; i <= 14; i++) {
            System.out.println("Lógica - Digite a matricula do " + (i + 1) + "° aluno.");
            l[i] = entrada.nextInt();
        }
        for (i = 0; i <= 9; i++) {
            System.out.println("Linguagem de Programação - Digite a matricula do " + (i + 1) + "° aluno.");
            lp[i] = entrada.nextInt();
        }

        System.out.println("====================================");
        System.out.println("Alunos de Lógica:");
        for (i = 0; i <= 14; i++) {
            System.out.print(i + ",");
        }
        System.out.println("\n===================================");
        System.out.println("Alunos de Linguagem de Programação:");
        for (i = 0; i <= 9; i++) {
            System.out.print(i + ",");
        }

        System.out.println("\n=====================================");
        System.out.println("Aluno matriculado nas duas disciplinas:");

        for (i = 0; i <= l.length - 1; i++) {
            for (j = 0; j <= lp.length - 1; j++) {
                if (l[i] == lp[j]) {
                    int rep = lp[j];
                    System.out.print(rep + ", ");
                    break;
                }
            }
        }
    }
}


