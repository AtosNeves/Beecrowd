package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        int i, a, d = 10;
        a = input.nextInt();

        for (i = 0; i < a; i++) {
            System.out.print(frase.charAt(i));

        }
        System.out.println();
        input.close();

    }

}

