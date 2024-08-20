package Strings;

import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alfa;
        String frase;

        while (input.hasNext()) {

            alfa = input.nextLine();
            frase = input.nextLine();
            int soma = 0;
            for (int i = 0; i < alfa.length(); i++) {
                for (int j = 0; j < frase.length(); j++) {
                    if (alfa.charAt(i) == frase.charAt(j)) {
                        soma = soma + 1;
                    }
                }
            }
            System.out.println(soma);
            soma = 0;

        }
        input.close();
        System.exit(0);
    }
}
