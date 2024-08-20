package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a, b = 1, c = 0;
        int i, j;
        long vetor[];
        vetor = new long[128];
        vetor[0] = 0;
        vetor[1] = 1;
        a = input.nextInt();

        for (i = 2; i < 62; i++) {
            vetor[i] = vetor[i - 1] + vetor[i - 2];
        }
        while (b <= a)

        {
            c = input.nextInt();

            for (j = 0; j <= 60; j++) {

                if (c == j) {
                    System.out.println("Fib(" + j + ") = " + vetor[j]);

                }
            }
            b = b + 1;
        }
    }
}

