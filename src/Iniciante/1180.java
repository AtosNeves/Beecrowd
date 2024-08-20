package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int tam, i, menor, p;
        tam = input.nextInt();

        int vetor[];
        vetor = new int[tam];
        vetor[0] = input.nextInt();

        p = 0;
        menor = vetor[0];
        for (i = 1; i < tam; i++) {
            vetor[i] = input.nextInt();

            if (vetor[i] < menor) {
                menor = vetor[i];
                p = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + p);

        input.close();
    }
}

