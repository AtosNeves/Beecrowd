package Iniciante;

import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a, b, c, i, contador = 0;
        int notas[] = { 2, 5, 10, 20, 50, 100 };
        while (input.hasNext()) {
            a = input.nextInt();
            b = input.nextInt();
            if (a <= 0 && b <= 0) {
                System.exit(0);
            } else {

                contador = 0;
                c = b - a;

                for (i = 5; i >= 0; i--) {
                    if (c >= notas[i]) {
                        c = c - notas[i];
                        contador = contador + 1;
                    }

                    if (contador == 2) {
                        break;
                    }
                }
                if (c == 0 && contador == 2) {
                    System.out.println("possible");

                } else {
                    System.out.println("impossible");

                }
            }
        }
    }
}

