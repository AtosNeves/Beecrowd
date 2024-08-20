package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int x = 0;
        int a, b;
        int soma = 0;

        while (x == 0) {
            a = input.nextInt();

            if (a == 0) {
                x = 1;
            }

            else {

                if (a % 2 == 1 || a % 2 == -1) {
                    a = a + 1;
                }

                for (b = 0; b < 5; b++) {
                    soma = soma + a;
                    a = a + 2;
                }
                System.out.println(soma);

                soma = 0;
                a = 0;
            }
        }

    }
}

