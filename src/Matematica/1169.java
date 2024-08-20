package Matematica;

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, i, q;
        double g = 0, v = 1, r;
        q = input.nextInt();

        while (q >= 1) {

            a = input.nextInt();

            for (i = 1; i <= a; i++) {
                v = v * 2;
            }

            // printf("%d\n", v);
            // v = 0;
            g = v / 12;
            g = g / 1000;
            r = Math.floor(g);
            String result = String.format("%.0f", r);
            System.out.println(result + " kg");

            g = 0;
            v = 1;
            q = q - 1;
        }
    }
}
