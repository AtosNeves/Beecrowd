package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double m[][], soma = 0;
        m = new double[12][12];
        int l, c, a = 10, contagem = 0;
        char f;
        f = input.next().charAt(0);

        for (l = 0; l < 12; l++) {
            for (c = 0; c < 12; c++) {
                m[l][c] = input.nextDouble();

            }
        }

        for (l = 0; l < 12; l++) {

            for (c = 0; c <= a; c++) {
                soma = soma + m[l][c];
                contagem = contagem + 1;
            }
            a = a - 1;
        }

        // printf("%lf\n",soma);
        String resultado;
        if (f == 'S') {
            resultado = String.format("%.1f", soma);
            System.out.println(resultado);

        } else if (f == 'M') {
            resultado = String.format("%.1f", soma / contagem);
            System.out.println(resultado);

        }
        input.close();
    }
}

