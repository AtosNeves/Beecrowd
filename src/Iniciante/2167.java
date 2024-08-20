package Iniciante;

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] v = new int[n];
        boolean verificador = false;

        for (int i = 0; i < n; i++) {
            v[i] = input.nextInt();
        }
        for (int i = 1; i < n; i++) {

            if (v[i - 1] > v[i]) {
                System.out.println(i+1);
                verificador = true;
                break;
            }

        }
        if (verificador==false) {
            System.out.println("0");
        }

    }

}

