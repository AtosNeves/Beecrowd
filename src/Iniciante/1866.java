package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int e, i, s = 0, a = 1, b = -1, c, d = 0;
        c = input.nextInt();

        while (d < c) {

            e = input.nextInt();
            for (i = 0; i < e; i++) {

                if (i % 2 == 0) {
                    s = s + a;
                }

                if (i % 2 != 0) {
                    s = s + b;
                }
            }
            System.out.println(s);

            d = d + 1;
            s = 0;
        }
    }

}

