package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        long ho, contador = 1;
        ho = input.nextLong();

        while (contador < ho) {
            System.out.print("Ho ");

            contador = contador + 1;
        }

        System.out.println("Ho!");
        input.close();
    }
}

