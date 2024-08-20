package Estruturas_e_Bilbiotecas;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static final double PI = 3.1415926535897;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        for (int j = 0; j < testes; j++) {

            int q = input.nextInt();
            int[] v = new int[q];
            int[] v2 = new int[q];
            for (int i = 0; i < q; i++) {
                v[i] = input.nextInt();

            }
            for (int i = 0; i < q; i++) {
                v2[i] = v[i];
            }

            Arrays.sort(v2);

            v2 = reverse(v2);

            System.out.println(resultado(v, v2));
        }
    }

    public static int resultado(int[] v, int[] v2) {

        int q = 0;
        for (int i = 0; i < v.length; i++) {

            if (v[i] == v2[i]) {
                q = q + 1;
            }
        }

        return q;
    }

    public static int[] reverse(int[] v) {

        int[] r = new int[v.length];

        int c = 0;
        for (int i = v.length - 1; i >= 0; i--) {

            r[c] = v[i];
            c = c + 1;

        }

        return r;
    }

}

