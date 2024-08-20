package Iniciante;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    double raio = input.nextDouble();
    double raio3= (double)Math.pow (raio,3 );;
    double v = ((4/3.0)*3.14159*raio3);
    String volume = String.format("%.3f",v);
    System.out.println("VOLUME = "+volume);
    input.close();

    }    
}
