package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double m[][], soma = 0;
        m = new double[12][12];
        int n = 0;
        int i, j;
        char f;
        f = input.next().charAt(0);

        for (i = 0; i < 12; i++) {
            for (j = 0; j < 12; j++) {
                m[i][j] = input.nextDouble();

            }
        }
        for (i = 7; i <= 11; i++) {
            for (j = 11 - i + 1; j <= i - 1; j++) {
                soma = soma + m[i][j];
                n = n + 1;
            }
        }

        // printf("%lf\n",soma);
        String resultado;
        if (f == 'S') {
            resultado = String.format("%.1f", soma);
            System.out.println(resultado);

        } else if (f == 'M') {
            resultado = String.format("%.1f", soma / n);
            System.out.println(resultado);

        }
        input.close();
    }
}

