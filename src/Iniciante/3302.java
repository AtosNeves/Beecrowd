package Iniciante;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int testes;
        int entrada;
        testes = input.nextInt();
        for (int i = 0; i < testes; i++) {
            entrada = input.nextInt();
            System.out.println("resposta " + (i + 1) + ": " + entrada);

        }
        input.close();
    }
}

