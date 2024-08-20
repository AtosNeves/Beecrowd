package Iniciante;

import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

class Main {

    public static void main(String[] args) throws IOException {

        final double p1001 = 1.5;
        final double p1002 = 2.5;
        final double p1003 = 3.5;
        final double p1004 = 4.5;
        final double p1005 = 5.5;

        Scanner input = new Scanner(System.in);
        int q, i, escolha, quantidade;
        double soma = 0;
        q = input.nextInt();

        for (i = 0; i < q; i++) {
            escolha = input.nextInt();
            quantidade = input.nextInt();

            switch (escolha) {
            case 1001:
                soma = soma + p1001 * quantidade;
                break;
            case 1002:
                soma = soma + p1002 * quantidade;
                break;
            case 1003:
                soma = soma + p1003 * quantidade;
                break;
            case 1004:
                soma = soma + p1004 * quantidade;
                break;
            case 1005:
                soma = soma + p1005 * quantidade;
            default:
                break;
            }
        }
        System.out.printf("%.2f\n", soma);

    }
}

