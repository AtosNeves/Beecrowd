package Estruturas_e_Bilbiotecas;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int veri(String c) {
        boolean tick = false;
        boolean t = true;
        int u = 0;
        boolean verifica = false;
        int i;
        int len = c.length();
        for (i = 0; i < len; i++) {
            if (c.charAt(i) == '(') {
                u = u + 1;
            }
           
            if (c.charAt(i) == ')') {
                u = u - 1;
            }
            if (u < 0) {
                return 1;
            }
        }
        if (u == 0) {
            return 0;
        }
        if (u != 0) {
            return 1;
        }
        return len;
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        boolean verifica = false;
        int h = 0;

        String entrada;
        while (input.hasNext()) {
            entrada = input.nextLine();

            int r = veri(entrada);
            switch (r) {
                case 1:
                    System.out.println("incorrect");

                    break;
                case 0:

                    System.out.println("correct");
                    break;
                default:
                    break;
            }
        }

    }
}

