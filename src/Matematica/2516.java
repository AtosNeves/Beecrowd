package Matematica;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {

            int s = input.nextInt();
            int va = input.nextInt();
            int vb = input.nextInt();

            if (alcance(s, va, vb) == -1) {
                System.out.println("impossivel");
            } else {

                System.out.printf("%.2f\n", alcance(s, va, vb));
            }
        }
    }

    public static double alcance(double s, double va, double vb) {

        double delta = va - vb;

        if (delta == 1) {
            return s;
        }

        if (delta > 1) {
            return s / (va - vb);
        }
        if (delta <= 0) {
            return -1;
        }

        return 0.0;

    }

}

