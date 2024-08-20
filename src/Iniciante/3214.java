package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int e = input.nextInt();
        int f = input.nextInt();
        int c = input.nextInt();
        int contador = 0;
        int g = e + f;

        while (g >= c) {

            g = g - c;
            contador = contador + 1;
            g = g + 1;

        }
        System.out.println(contador);
    }
}

