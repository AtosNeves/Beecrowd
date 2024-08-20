package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int l = 0, c = 0, mm = 0;
        double m[][], entrada = 0, soma = 0;
        m = new double[12][12];
        char f;
        f = input.next().charAt(0);

        for (l = 0; l < 12; l++) {
            for (c = 0; c < 12; c++) {
                m[l][c] = input.nextDouble();

            }
        }

        for (l = 0; l < 12; l++) {
            for (c = l + 1; c < 12; c++) {

                mm = mm + 1;
                soma = soma + m[l][c];
            }
        }
        String resultado;
        if (f == 'S') {
            resultado = String.format("%.1f", soma);
            System.out.println(soma);

        }

        if (f == 'M') {

            resultado = String.format("%.1f", soma / mm);
            System.out.println(resultado);

            input.close();
        }
    }
}

