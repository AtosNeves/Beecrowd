package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int vetor[], i, n, j;
        vetor = new int[10];
        for (i = 0; i < 10; i++) {
            n = input.nextInt();

            if (n <= 0) {
                n = 1;
            }
            vetor[i] = n;
        }

        for (j = 0; j < 10; j++) {
            System.out.println("X[" + j + "] = " + vetor[j]);

        }

    }
}

