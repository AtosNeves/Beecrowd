package Matematica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a, b, i, c, d, soma = 0;
        while (input.hasNext()) {

            a = input.nextLong();
            b = input.nextLong();

            c = a;
            d = b;
            if (a != 0) {
                for (i = a; i > 1; i--) {
                    c = c * (i - 1);
                }
            }
            if (a == 0) {
                c = 1;
            }

            if (b != 0) {
                for (i = b; i > 1; i--) {
                    d = d * (i - 1);
                }
            }
            if (b == 0) {
                d = 1;
            }
            System.out.println(c + d);

            c = 0;
            d = 0;
        }
    }
}
