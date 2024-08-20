package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int entrada;
        entrada = input.nextInt();
        String resultado;
        int l = 0, c = 0;
        double m[][];
        m = new double[12][12];
        double soma = 0.0;
        double media = 0.0;

        char op;
        op = input.next().charAt(0);

        for (l = 0; l < 12; l++)

        {
            for (c = 0; c < 12; c++) {
                m[l][c] = input.nextDouble();

            }
        }

        for (c = 0; c < 12; c++) {
            soma = soma + m[c][entrada];
        }

        media = soma / 12.0;

        // printf("%lf\n",soma);

        if (op == 'S') {
            resultado = String.format("%.1f", soma);
            System.out.println(resultado);

        }
        if (op == 'M') {
            resultado = String.format("%.1f", media);
            System.out.println(resultado);
        }
        input.close();
    }
}

