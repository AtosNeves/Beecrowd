package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float c1 = input.nextFloat();
        float c2 = input.nextFloat();
        if (c1 > 0 && c2 > 0) {
            System.out.println("Q1");
        }
        if (c1 < 0 && c2 > 0) {
            System.out.println("Q2");
        }
        if (c1 < 0 && c2 < 0) {
            System.out.println("Q3");
        }
        if (c1 > 0 && c2 < 0) {
            System.out.println("Q4");
        }
        if (c1 == 0 && c2 == 0) {
            System.out.println("Origem");
        }
        if ((c1 == 0 && c2 != 0)) {
            System.out.println("Eixo Y");
        }
        if ((c1 != 0 && c2 == 0)) {
            System.out.println("Eixo X");
        }

    }

}