package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if (a == 0) {
            System.out.println("E");

        }
        if (1 <= a && a <= 35) {
            System.out.println("D");

        }
        if (36 <= a && a <= 60) {
            System.out.println("C");

        }
        if (61 <= a && a <= 85) {
            System.out.println("B");

        }
        if (86 <= a && a <= 100) {
            System.out.println("A");

        }

    }
}
