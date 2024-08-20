package Matematica;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final Double G = 9.80665;
    public static final Double PI = 3.14159;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            Double h = input.nextDouble();
            int p1 = input.nextInt();
            int p2 = input.nextInt();
            int testes = input.nextInt();
            for (int i = 0; i < testes; i++) {

                Double alfa = input.nextDouble();
                Double v = input.nextDouble();

                double vx = VX(alfa, v);
                double vy = VY(alfa, v);

                double fim = distancia(vy, vx, h);
                String saida = String.format("%.5f", fim);
                saida = saida.replace(",", ".");
                System.out.print(saida);
                if (acertou(fim, p1, p2) == true) {
                    System.out.println(" -> DUCK");
                }
                if (acertou(fim, p1, p2) == false) {
                    System.out.println(" -> NUCK");
                }
            }
        }
    }

    public static boolean acertou(double entrada, int p1, int p2) {

        if (entrada >= p1 && entrada <= p2) {
            return true;
        } else {

            return false;
        }
    }

    public static double distancia(double vy, double b, double c) {

        double a = -G / 2.0;
        double t = 0;
        double delta = (Math.sqrt(vy * vy - 4.0 * a * c));

        double t1 = (-vy + delta) / (2.0 * a);
        double t2 = (-vy - delta) / (2.0 * a);
        if (t1 > 0) {
            t = t1;
        }
        if (t2 > 0) {

            t = t2;
        }
        double r =  (b * t);
        return r;
    }

    public static double hmax(double v, double a) {

        a = (a / 180) * PI;
        double sin2 = Math.pow(Math.sin(a), 2.0);

        double r = v * v * sin2 / (2.0 * G);
        return r;

    }

    public static double VY(double a, double v) {

        a = (a / 180) * PI;
        a = Math.sin(a);
        return a * v;

    }

    public static double VX(double a, double v) {

        a = (a / 180) * PI;
        a = Math.cos(a);
        return a * v;

    }

}

