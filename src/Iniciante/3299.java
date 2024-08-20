package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        boolean v = true;
        // char entrada;
        String entrada = input.nextLine();

        int i;
        // int len = strlen(entrada);
        for (i = 1; i < entrada.length(); i++) {
            if (entrada.charAt(i - 1) == '1' && entrada.charAt(i) == '3') {
                System.out.println(entrada + " es de Mala Suerte");
                v = false;
                break;
            }
        }
        if (v == true) {
            System.out.println(entrada + " NO es de Mala Suerte");
        }

    }
}

