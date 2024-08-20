package Iniciante;

import java.util.Scanner;

import java.util.Locale;

import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        float entrada = input.nextFloat();
        if (0<=entrada && entrada <= 25) {
            System.out.println("Intervalo [0,25]");
        }
        else if (25 < entrada && entrada <=50) {
            System.out.println("Intervalo (25,50]");
        }
        else if (50<entrada && entrada <=75) {
            System.out.println("Intervalo (50,75]");
        }
        else if(75<entrada && entrada <=100){
            System.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora do intervalo");
        }
        input.close();
    }
}
