package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        double t = input.nextDouble();
        double vm = input.nextDouble();
        double d = vm * t;

        double qt = d/12;
        String resultado = String.format("%.3f", qt);
        System.out.println(resultado);
    
    }
}
