package Iniciante;

import java.io.*;
import java.util.Scanner;
public class a1018 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int valor=0;
        int quantidade =0;
        valor = input.nextInt();
        System.out.println(valor);

        quantidade = valor/100;
        System.out.println(quantidade+" nota(s) de R$ 100,00");
        valor = valor%100;

        quantidade = valor / 50;
        System.out.println(quantidade +" nota(s) de R$ 50,00");
        valor = valor %50;

        quantidade = valor /20;
        System.out.println(quantidade +" nota(s) de R$ 20,00");
        valor = valor %20;

        quantidade = valor /10;
        System.out.println(quantidade+ " nota(s) de R$ 10,00");
        valor = valor%10;

        quantidade = valor /5;
        System.out.println(quantidade+" nota(s) de R$ 5,00");
        valor = valor %5;

        quantidade = valor /2;
        System.out.println(quantidade +" nota(s) de R$ 2,00");
        valor = valor %2;

        System.out.println(valor+ " nota(s) de R$ 1,00");




        input.close();
    }
}
