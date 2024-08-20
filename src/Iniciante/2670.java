package Iniciante;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static final double PI = 3.1415926535897;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int[] v = new int[3];
        for (int i = 0; i < 3; i++) {
            v[i] = input.nextInt();
        }

        System.out.println(tempo(v));

    }

    public static int tempo(int[] v) {
        int menor = 150000;

        int c1 = (v[0] * 2 + v[2] * 2);
        int c2 = v[0] * 4 + v[1] * 2;
        int c3 = v[1] * 2 + v[2] * 4;

        for (int i = 0; i < 4; i++) {

            if (c1 < menor) {
                menor = c1;
            }
            if (c2 < menor) {
                menor = c2;
            }
            if (c3 < menor) {
                menor = c3;
            }

        }

        return menor;

    }

}

