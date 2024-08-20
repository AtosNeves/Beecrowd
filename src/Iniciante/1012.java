package Iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    //a) triangulo retangulo
    double tri = (a*c)/2;
    String triangulo = String.format("%.3f", tri);
    System.out.println("TRIANGULO: "+triangulo);

    //b) area do circulo - pi = 3.14159
    double area = 3.14159* Math.pow(c,2);
    String area2 = String.format("%.3f", area);
    System.out.println("CIRCULO: "+area2);

    //c) a área do trapézio que 
    //tem A e B por bases e C por altura.
    double areat = (a+b)*c/2;
    String areatt = String.format("%.3f", areat);
    System.out.println("TRAPEZIO: "+areatt);

    //d)a área do quadrado que tem lado B.
    double q = Math.pow(b, 2);
    String quadrado = String.format("%.3f",q);
    System.out.println("QUADRADO: "+quadrado);

    //e) a área do retângulo que tem lados A e B
    double r = a*b;
    String retangulo = String.format("%.3f",r);
    System.out.println("RETANGULO: "+retangulo);

    input.close();
}

}