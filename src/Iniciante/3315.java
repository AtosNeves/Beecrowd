package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int soma1 = 0, soma2 = 0, soma3 = 0, soma4 = 0;
        int i, entrada;
        int convertido[];
        convertido = new int[800000];
        convertido[0] = '\n';
        for (i = 0; i < 7; i++) {
            entrada = input.nextInt();

            soma1 = soma1 + entrada;
        }
        entrada = 0;
        for (i = 0; i < 7; i++) {
            entrada = input.nextInt();

            soma2 = soma2 + entrada;
        }
        entrada = 0;
        for (i = 0; i < 7; i++) {
            entrada = input.nextInt();

            soma3 = soma3 + entrada;
        }
        entrada = 0;
        for (i = 0; i < 7; i++) {
            entrada = input.nextInt();

            soma4 = soma4 + entrada;
        }
        entrada = 0;
        int somas[];
        somas = new int[5];
        somas[0] = soma1;
        somas[1] = soma2;
        somas[2] = soma3;
        somas[3] = soma4;

        int maior = soma1;
        for (i = 0; i < 5; i++) {
            if (somas[i] > maior) {
                maior = somas[i];
            }
        }
        int resultado = maior;
        int contador = 0;
        while (maior >= 1) {
            convertido[contador] = maior % 2;
            maior = maior / 2;
            contador = contador + 1;
        }
        contador = contador - 1;
        System.out.print(resultado + " = ");

        while (contador >= 0) {
            System.out.print(convertido[contador]);

            contador = contador - 1;
        }
        System.out.println();

    }
}

