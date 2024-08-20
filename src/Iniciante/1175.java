package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int vetor[], i, j, entrada;
        vetor = new int[20];
        int u = 0;
        for (i = 0; i < 20; i++) {
            entrada = input.nextInt();

            vetor[i] = entrada;
        }

        for (j = 19; j >= 0; j--) {

            System.out.println("N[" + u + "] = " + vetor[j]);

            u = u + 1;
        }
    }
}

