package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t, i, m;
        t = input.nextInt();
        t = t + 1;
        int p[] = new int[t];

        for (i = 1; i < t; i++) {
            p[i] = input.nextInt();

        }
        m = p[1];
        for (i = 1; i < t; i++) {
            if (m > p[i]) {
                m = i;
                break;
            } else {
                m = 1;
            }
        }
        System.out.println(m);

    }

}

