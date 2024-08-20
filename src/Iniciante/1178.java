package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double vetor[], aux;
        vetor = new double[100];
        double b;
        int i, j;
        String resul;
        b = input.nextDouble();

        for (i = 0; i < 100; i++) {
            vetor[i] = b;
            b = b / 2;
        }
        for (j = 0; j < 100; j++) {
            resul = String.format("%.4f", vetor[j]);
            System.out.println("N[" + j + "] = " + resul);

        }

        input.close();
    }
}

