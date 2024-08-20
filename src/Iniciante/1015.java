package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double xx = x2-x1;
        double yy = y2-y1;
        double d = Math.sqrt(Math.pow(xx, 2)+Math.pow(yy, 2));
        String resultado = String.format("%.4f", d);
        System.out.println(resultado);


    }    
}
