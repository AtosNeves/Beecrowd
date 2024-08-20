package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        float vetor[];
        vetor = new float[100];
        float entrada;
        int i, j;
        for (i = 0; i < 100; i++) {
            vetor[i] = input.nextFloat();

        }
        for (j = 0; j < 100; j++) {

            if (vetor[j] <= 10) {
                String valor = String.format("%.1f", vetor[j]);
                System.out.println("A[" + j + "] = " + valor);

            }
        }

    }
}
