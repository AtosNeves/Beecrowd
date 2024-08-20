package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int i, b, d = 0;
        int f[];
        f = new int[60];
        f[1] = 1;
        f[0] = 0;
        f[2] = 2;
        b = input.nextInt();

        if (b >= 2) {
            for (i = 0; i < b - 1; i++) {

                f[i + 2] = f[i + 1] + f[i];

                d = d + 1;
            }
        }
        for (i = 0; i < b; i++) {

            if (i < b - 1) {
                System.out.print(f[i] + " ");
            } else {
                System.out.println(f[i]);
            }
        }

        input.close();
    }
}

