package Matematica;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        for (int i = 0; i < testes; i++) {

            int q = input.nextInt();
            System.out.println(quantidade(q));
        }
    }

    static int quantidade(int q) {

        return q * (q + 1) / 2 + 1;
    }
}

