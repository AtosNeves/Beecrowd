package Iniciante;

import java.util.Scanner;

import java.io.IOException;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String nomes[] = new String[11];

        for (int i = 0; i < 10; i++) {
            nomes[i] = input.nextLine();
        }
        System.out.println(nomes[2]);
        System.out.println(nomes[6]);
        System.out.println(nomes[8]);
        input.close();
        System.exit(0);
    }

}
