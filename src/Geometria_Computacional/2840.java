package Geometria_Computacional;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int r, v, c = 0;

        double resultado;
        r = input.nextInt();
        v = input.nextInt();

        resultado = veri(r, v);
        String resul = String.format("%.0f", resultado);
        System.out.println(resul);

        input.close();
    }

    static float veri(int a, int b) {
        int contador = 0;
        double pi = 3.1415;
        double res = Math.floor(4 * pi * Math.pow(a, 3) / 3);
        while (res < b) {
            b = (int) (b - res);
            contador = contador + 1;
        }
        return contador;
    }
}

