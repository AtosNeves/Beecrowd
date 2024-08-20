package Iniciante;

import java.util.Scanner;
public class uri1043 {


   public static void main(String[] args)
        {
            float a, b, c;
            Scanner input = new Scanner(System.in);
            a = input.nextFloat();
            b = input.nextFloat();
            c = input.nextFloat();


            if (a + b > c && a + c > b && b + c > a)
            {
                float r;
                r = a + b + c;
                String res = String.format("%.1s", r);
                System.out.println("Perimetro = " + res);
            }
            else
            {
                float r;
                r = (a + b) * c / 2;
                String res = String.format("%.1s", r);
                System.out.println("Area = " + res);
            }
        }
    }


