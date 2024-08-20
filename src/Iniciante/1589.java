package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int testes = 0, contador = 0;
        int r1, r2;
        testes = input.nextInt();

        while (contador < testes) {
            r1 = input.nextInt();
            r2 = input.nextInt();
            System.out.println(r1 + r2);

            contador = contador + 1;
        }
        input.close();
    }
}

