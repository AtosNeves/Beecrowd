package Iniciante;

import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean v = false;
        int xx = input.nextInt();
        int yy = input.nextInt();
        int m[][] = new int[xx][yy];
        for (int i = 0; i < xx; i++) {
            for (int j = 0; j < yy; j++) {
                m[i][j] = input.nextInt();
            }
        }

        for (int i = 1; i < xx - 1; i++) {
            for (int j = 1; j < yy - 1; j++) {
                if (m[i][j] == 42) {

                    if ((m[i][j - 1] == 7) && (m[i][j + 1] == 7) && (m[i - 1][j] == 7) && (m[i + 1][j] == 7)
                            && (m[i - 1][j + 1] == 7) && (m[i + 1][j - 1] == 7) && (m[i - 1][j - 1] == 7)
                            && (m[i + 1][j + 1] == 7)) {
                        int x = i + 1;
                        int y = j + 1;
                        System.out.println(x + " " + y);
                        v = true;
                        System.exit(0);
                        break;
                    }

                }
            }

        }
        if (v == false) {
            System.out.println("0 0");
        }

    }
}
