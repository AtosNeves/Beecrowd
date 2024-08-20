package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int perfeito(int a1) {

        int a, j, b, p;
        b = 0;
        for (j = 2; j < a1; j++) {
            if (a1 % j == 0) {
                b = b + 1;
            }
        }
        return (b);

    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a, b, p, g, h;
        g = input.nextInt();

        for (h = 0; h < g; h++) {
            a = input.nextInt();

            b = perfeito(a);
            if (b > 0) {
                System.out.println(a + " nao eh primo");

            }
            if (b == 0) {
                System.out.println(a + " eh primo");
            }
            b = 1;
        }
    }
}

