package Iniciante;

import java.io.*;
import java.util.Scanner;
import java.util.Locale;
public class a1021 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        double quantidade =0;
        double valor = input.nextDouble();
        System.out.println(valor);
        System.out.println("NOTAS");
        
        
        quantidade = valor/100;
        double q100 = Math.floor(quantidade);
        String n100 = String.format("%.0f", q100);
        System.out.println(n100+" nota(s) de R$ 100.00");
        valor = valor%100;

        quantidade = valor / 50;
        double q50 = Math.floor(quantidade);
        String n50 = String.format("%.0f", q50);
        System.out.println(n50 +" nota(s) de R$ 50.00");
        valor = valor %50;

        quantidade = valor /20;
        double q20 = Math.floor(quantidade);
        String n20 = String.format("%.0f", q20);
        System.out.println(n20 +" nota(s) de R$ 20.00");
        valor = valor %20;

        quantidade = valor /10;
        double q10 = Math.floor(quantidade);
        String n10 = String.format("%.0f", q10);
        System.out.println(n10+ " nota(s) de R$ 10.00");
        valor = valor%10;

        quantidade = valor /5;
        double q5 = Math.floor(quantidade);
        String n5= String.format("%.0f",q5);
        System.out.println(n5+" nota(s) de R$ 5.00");
        valor = valor %5;

        quantidade = valor /2;
        double q2 = Math.floor(quantidade);
        String n2 = String.format("%.0f",q2);
        System.out.println(n2 +" nota(s) de R$ 2.00");
        valor = valor %2;

        System.out.println("MOEDAS");
        quantidade = valor/1;
        double m1 = Math.floor(quantidade);
        String i = String.format("%.0f", m1);
        System.out.println(i+ " moeda(s) de R$ 1.00");
        valor = valor %1;
        quantidade = quantidade %1;
        double q = Double.valueOf(quantidade);
        double valorr = Double.valueOf(valor);
        
        
        
        q = valorr / 0.5;
        double m55 = Math.floor(q);
        String m5 = String.format("%.0f",m55);
        System.out.println(m5+" moeda(s) de R$ 0.50");
        valorr = valorr % 0.5;

        q = valorr / 0.25;
        double m255 = Math.floor(q);
        String m25 = String.format("%.0f",m255);
        System.out.println(m25+" moeda(s) de R$ 0.25");
        valorr = valorr % 0.25;

        q = valorr / 0.10;
        double m550 = Math.floor(q);
        String m10= String.format("%.0f",m550);
        System.out.println(m10+" moeda(s) de R$ 0.10");
        valorr = valorr % 0.10;

        q = valorr / 0.05;
        double m555 = Math.floor(q);
        String mm5 = String.format("%.0f", m555);
        System.out.println(mm5+" moeda(s) de R$ 0.05");
        valorr = valorr % 0.05;

        valorr=valorr*100;
        q=valorr;
        String fim = String.format("%.0f", q);
        System.out.println(fim+" moeda(s) de R$ 0.01");







        input.close();
    }
}
