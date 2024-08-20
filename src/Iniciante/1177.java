package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int N[];
        N = new int[1000];
        N[0] = 0;
        N[1] = 1;
        int a, i = 0, j, k, b = 0, c = 0;
        a = input.nextInt();

        for (j = 0; j < 1000; j++) {
            N[j] = j % a;
        }

        for (j = 0; j < 1000; j++) {
            System.out.println("N[" + j + "] = " + N[j]);

        }
    }
}

