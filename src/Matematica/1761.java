package Matematica;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        while (input.hasNext()) {
            double alfa = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();

            double sin = Math.sin(toRad(alfa));
            double cos = Math.cos(toRad(alfa));

            double hipo = hip(b, cos);
            double tree = arvore(hipo, sin);
            System.out.printf("%.2f", (tree + c) * 5);
        }
        input.close();
        System.out.println();
        System.exit(0);
    }
    
    
    public static double arvore(double hip, double sin) {

        return sin*hip;
    }

    public static double hip(double d, double cos) {

        return d / cos;

    }

    public static double toRad(double alfa) {

        final double PI = 3.141592654;

        return alfa * PI / 180;

    }

}

