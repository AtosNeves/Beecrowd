package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int perfeito(int a1) {

        int j, b;
        b = 0;
        for (j = 1; j < a1; j++) {
            if (a1 % j == 0) {
                b = b + j;
            }
        }
        return (b);
        // System.out.println(b);

    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        {

            int a, b, p, g, h;
            g = input.nextInt();

            for (h = 0; h < g; h++) {
                a = input.nextInt();

                b = perfeito(a);

                if (b == a) {
                    System.out.println(a + " eh perfeito");

                }

                if (b != a) {
                    System.out.println(a + " nao eh perfeito");

                }

            }
        }
    }
}

