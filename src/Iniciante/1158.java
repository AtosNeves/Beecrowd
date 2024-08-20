package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a=0, b=0, c=0, j=0, soma=0;
        int d = 0;
        soma = 0;
        a = input.nextInt();
        for (d = 0; d < a; d++) {
            b = input.nextInt();
            c = input.nextInt();

            if (b % 2 == 0) {
                b = b + 1;
            }
            for (j = 0; j < c; j++) {
                soma = soma + b;
                b = b + 2;
            }
            System.out.println(soma);

            soma = 0;
        }
    }
}

