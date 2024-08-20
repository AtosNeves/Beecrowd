package Iniciante;

import java.io.IOException;
import java.util.Scanner;



public class Main1008 {
    

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        float c = input.nextFloat();
        float s = b*c;
        String ss = String.format("%.2f",s);
        System.out.println("NUMBER = "+a);
        System.out.println("SALARY = U$ "+ss);
        input.close();
        

    }

}