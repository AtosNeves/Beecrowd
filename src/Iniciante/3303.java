package Iniciante;

import java.math.BigInteger;
import java.util.Scanner;
import java.lang.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String palavra;

        while (input.hasNext()) {
            palavra = input.nextLine();
            int len = palavra.length();
            if (len < 10) {
                System.out.println("palavrinha");

            } else {
                System.out.println("palavrao");
            }
        }

    }

}

