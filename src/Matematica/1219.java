package Matematica;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static final double PI = 3.1415926535897;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double t = aTriangulo(a, b, c);
            double cc = aCicrulo(a,b,c);
            double cmenor = cMenor(a, b, c);
            
            System.out.printf("%.4f ", (cc - t));
            System.out.printf("%.4f ", t - cmenor);
            System.out.printf("%.4f\n", cmenor);
        }
    }

    public static double cMenor(double a, double b, double c) {

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

    public static double aCicrulo(double a,double b,double c) {
        double p = (a + b + c) / 2;

        double at = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        double r = a * b * c / (4 * at);

        return PI * r * r;

    }

    static double aTriangulo(double a, double b, double c) {

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

}

