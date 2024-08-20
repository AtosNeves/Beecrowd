package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Double aux = 0.0;
        Double f1 = input.nextDouble();
        Double f2 = input.nextDouble();
        aux = (f1 * 100) / 100;

        Double pib1 = 100 + aux;

        aux = (pib1 * f2) / 100;

        pib1 = pib1 + aux;

        pib1 = pib1 - 100;

        String saida = String.format("%.6f", pib1);
        System.out.println(saida);

    }
}
