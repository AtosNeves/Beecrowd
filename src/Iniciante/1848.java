package Iniciante;

import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String n0 = "---";
        String n1 = "--*";
        String n2 = "-*-";
        String n3 = "-**";
        String n4 = "*--";
        String n5 = "*-*";
        String n6 = "**-";
        String n7 = "***";
        int soma = 0;
        int grito = 3;
        String entrada;
        while (grito>=1) {

            entrada = input.nextLine();
            if (entrada.equals(n0)) {
                soma = soma + 0;
            }
            if (entrada.equals(n1)) {
                soma = soma + 1;
            }
            if (entrada.equals(n2)) {
                soma = soma + 2;
            }
            if (entrada.equals(n3)) {
                soma = soma + 3;
            }
            if (entrada.equals(n4)) {
                soma = soma + 4;
            }
            if (entrada.equals(n5)) {
                soma = soma + 5;
            }
            if (entrada.equals(n6)) {
                soma = soma + 6;
            }
            if (entrada.equals(n7)) {
                soma = soma + 7;
            }
            if (entrada.equals("caw caw")) {
                System.out.println(soma);
                soma = 0;
                grito = grito - 1;
                
            }

        }

        input.close();
    }
}
