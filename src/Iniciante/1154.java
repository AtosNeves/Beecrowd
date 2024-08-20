package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int a, contador = 0, q = 0;
        a = 0;
        float soma = 0;
        q = 0;
        float media = 0;
        while (contador < 1) {

            a = input.nextInt();

            if (a > 0) {
                soma = soma + a;
                q = q + 1;
            } else {
                media = soma / q;
                contador++;
                String resul = String.format("%.2f", media);

                System.out.println(resul);
                break;
            }
        }

        input.close();
    }
}

