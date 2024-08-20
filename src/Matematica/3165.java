package Matematica;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();
        int d = 1;
        int n1 = 0;
        int n2 = 0;

        if (entrada == 5) {
            System.out.println("3 5");
        } else {

            for (int i = 5; i <= entrada; i++) {

                if (verificador(i) == true && verificador(i - 2) == true) {
                    n1 = i;
                    n2 = i - 2;
                }

            }
            if (n1 != 0 && n2 != 0) {

                System.out.println(n2 + " " + n1);
            }
        }
    }

    static boolean verificador(int entrada) {

        boolean resultado = true;
        for (int i = 3; i < entrada; i++) {

            if (entrada % i == 0) {
                resultado = false;
                break;
            }

        }
        return resultado;
    }

}

