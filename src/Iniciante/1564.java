package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int entrada, a;

        while (input.hasNext()) {
            entrada = input.nextInt();

            if (entrada == 0) {
                System.out.println("vai ter copa!");

            } else if (entrada >= 1) {
                System.out.println("vai ter duas!");

            }
        }
        input.close();
    }
}

