package Iniciante;

import java.math.BigInteger;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger entrada = input.nextBigInteger();
        String saida = entrada.toString();
       int len = saida.length();
       for (int i = len-1; i >= 0; i--) {
           System.out.print(saida.charAt(i));
       }
       System.out.println();
    }

}

