package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int vetor[], i, j, n;
        vetor = new int[10];
        n = input.nextInt();

        vetor[0] = n;
        for (i = 1; i < 10; i++) {
            n = n * 2;
            vetor[i] = n;
        }

        for (j = 0; j < 10; j++) {
            System.out.println("N[" + j + "] = " + vetor[j]);

        }

    }
}

