package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int o = 0, i;
        float up = 1, dp = 1;
        double soma = 0;
        for (i = 0; i < 19; i++) {

            up = up + 2;
            dp = dp * 2;

            soma = soma + (up / dp);
        }

        soma = soma + 1;
        String resul = String.format("%.2f", soma);
        System.out.println(resul);
        input.close();
    }
}

