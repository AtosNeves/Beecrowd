package Strings;

import java.io.*;
import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {

            String entrada = input.nextLine();
            int nr = 0;
            int nl = 0;
            for (int i = 0; i < entrada.length(); i++) {
                if (entrada.charAt(i) == '+') {
                    nr = i;

                }
                if (entrada.charAt(i) == '=') {
                    nl = i;
                }
            }
            String nrs = entrada.substring(0, nr);
            String nls = entrada.substring(nr + 1, nl);
            String fim = entrada.substring(nl + 1);
            int r = 0;
            int l = 0;
            int f = 0;
            if (Character.isDigit(nrs.charAt(0))) {
                r = Integer.valueOf(nrs);
            }
            if (Character.isDigit(nls.charAt(0))) {
                l = Integer.valueOf(nls);
            }
            if (Character.isDigit(fim.charAt(0))) {
                f = Integer.valueOf(fim);
            }

            if (nrs.charAt(0) == 'R') {
                System.out.println(f - l);
            }

            if (nls.charAt(0) == 'L') {
                System.out.println(f - r);
            }

            if (fim.charAt(0) == 'J') {
                System.out.println(r + l);
            }
        }
        input.close();
    }
}

