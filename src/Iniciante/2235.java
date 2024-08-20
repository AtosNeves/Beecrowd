package Iniciante;

import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[3];
        for (int i = 0; i < 3; i++) {
            vetor[i] = input.nextInt();
        }

        Arrays.sort(vetor);
        System.out.println(verifcador(vetor));
    }

    static String verifcador(int[] v) {

        if (v[0] == v[1] || v[1] == v[2]) {
            return "S";
        }

        if (v[0] == (v[1] + v[2])) {
            return "S";
        }
        if (v[1] == (v[0] + v[2])) {
            return "S";
        }
        if (v[2] == (v[0] + v[1])) {
            return "S";
        } else {
            return "N";

        }

    }

}
