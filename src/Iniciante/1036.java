package Iniciante;

import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double a,b,c,x1,x2;
        double delta;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        delta = Math.pow(b, 2)-4*a*c;

        if (delta>=0 && a!=0) {
            x1=(-b+Math.sqrt(delta))/(2*a);

            x2=(-b-Math.sqrt(delta))/(2*a);
            
            String r1 = String.format("%.5f", x1);
            String r2 = String.format("%.5f", x2);
            System.out.println("R1 = "+r1);
            System.out.println("R2 = "+r2);
        }
        else{
            System.out.println("Impossivel calcular");
        }
        input.close();
        
    }
}
