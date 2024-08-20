package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double m[][], soma = 0, entrada;
        m = new double[12][12];
        int i, j, c = 0;
        String o;
        o = input.nextLine();

        for (i = 0; i < 12; i++) {
            for (j = 0; j < 12; j++) {
                m[i][j] = input.nextDouble();

            }
        }

        for (i = 0; i < 12; i++) {
            for (j = 0; j < 12; j++) {
                if (i < j && i > 12 - j - 1) {
                    soma = soma + m[i][j];
                    c = c + 1;
                }
            }
        }

        if (o.charAt(0) == 'S') {
            System.out.printf("%.1f\n", soma);

        }
        if (o.charAt(0) == 'M') {
            System.out.printf("%.1\n", soma / c);

        }

        input.close();
    }
}

