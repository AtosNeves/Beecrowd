package Matematica;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static final double PI = 3.1415926535897;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            double t = aTriangulo(a, b, c);
            double cc = aCicrulo(a, b, c);
            double cmenor = cMenor(a, b, c);

            System.out.printf("%.4f ", cc - t);
            System.out.printf("%.4f ", t - cmenor);
            System.out.printf("%.4f\n", cmenor);
        }
    }

    public static double cMenor(int a, int b, int c) {

        // Passo 1
        double p = (a + b + c) / 2;

        // passo 2
        double n1 = p - a;
        double n2 = p - b;
        double n3 = p - c;
        double step2 = n1 * n2 * n3;

        double step3 = step2 * p;

        step3 = Math.sqrt(step3);

        // passo 4

        double step4 = step3 / p;

        return PI * Math.pow(step4, 2);
    }

    public static double aCicrulo(int a, int b, int c) {

        double r = (a * b * c) / Math.sqrt((a + b + c) * (b + c - a) * (c + a - b) * (a + b - c));

        return PI * Math.pow(r, 2);
    }

    static double aTriangulo(int a, int b, int c) {

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

}

