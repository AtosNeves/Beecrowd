package Strings;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String frase = "0";
        int j;
        int h = 0;
        int testes = 0, i, contador;
        testes = input.nextInt();
        frase = input.nextLine();
        for (j = 0; j < testes; j++) {

            frase = input.nextLine();

            contador = frase.length();
            // System.out.println(contador);
            if (frase.charAt(0) != ' ') {
                System.out.print(frase.charAt(0));

            }
            for (i = 1; i < contador; i++) {
                if (frase.charAt(i - 1) == ' ' && frase.charAt(i) != ' ') {
                    System.out.print(frase.charAt(i));

                }

            }
            System.out.println();

        }
        input.close();
    }
}

