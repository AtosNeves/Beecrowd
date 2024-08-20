package Iniciante;

import java.math.BigInteger;
import java.util.Scanner;
import java.lang.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b, c = 0;

        a = (float) input.nextDouble();
        b = (float) input.nextDouble();
        c = b / a;

        c = c * 100 - 100;
        String saida = String.format("%.2f", c);
        String saida2 = saida.replace(" ", "");
        
        System.out.println(saida2 + "%");

    }

}

