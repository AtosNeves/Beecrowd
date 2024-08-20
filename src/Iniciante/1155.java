package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double i, s = 0;
        for (i = 1; i <= 100; i++) {
            s = s + (1 / i);
        }
        String resul = String.format("%.2f", s);
        System.out.println(resul);

        input.close();
    }
}

