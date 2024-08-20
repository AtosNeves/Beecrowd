package Strings;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        String entrada;

        for (int i = 0; i < q; i++) {

            entrada = input.next();
            boolean resultado = true;
            resultado = verifica(entrada);
            if (resultado == false) {

                System.out.println(entrada + " nao eh facil");

            }
            if (resultado == true) {

                System.out.println(entrada + " eh facil");

            }
        }
    }

    public static boolean verifica(String entra) {
        boolean verifica = true;
        
        char[] vogais = { 'a', 'e', 'i', 'o', 'u' };

        char[] palavra = entra.toCharArray();

        for (int i = 0; i < entra.length() - 2; i++) {
            if ((palavra[i] != 'a' && palavra[i] != 'e' && palavra[i] != 'i' && palavra[i] != 'o' && palavra[i] != 'u')
                    && (palavra[i + 1] != 'a' && palavra[i + 1] != 'e' && palavra[i + 1] != 'i' && palavra[i + 1] != 'o'
                            && palavra[i + 1] != 'u')
                    && (palavra[i + 2] != 'a' && palavra[i + 2] != 'e' && palavra[i + 2] != 'i' && palavra[i + 2] != 'o'
                            && palavra[i + 2] != 'u')&& (palavra[i] != 'A' && palavra[i] != 'E' && palavra[i] != 'I' && palavra[i] != 'O'
                            && palavra[i] != 'U')
                    && (palavra[i + 1] != 'A' && palavra[i + 1] != 'E' && palavra[i + 1] != 'I' && palavra[i + 1] != 'O'
                            && palavra[i + 1] != 'U')
                    && (palavra[i + 2] != 'A' && palavra[i + 2] != 'E' && palavra[i + 2] != 'I' && palavra[i + 2] != 'O'
                            && palavra[i + 2] != 'U')) {
                verifica= false;
            }

        }
        return verifica;
    }
}

