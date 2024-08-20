package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double m[][], soma = 0;
        m = new double[12][12];
        int l, c, a = 11, contador = 0, n = 0;
        char f;
        f = input.next().charAt(0);

        for (l = 0; l < 12; l++) {
            for (c = 0; c < 12; c++) {
                m[l][c] = input.nextDouble();

            }
        }

        for (l = 0; l <= 4; l++) {
            for (c = l + 1; c <= 10 - l; c++) {
                soma = soma + m[l][c];
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

