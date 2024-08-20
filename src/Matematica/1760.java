package Matematica;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static final double PI = 3.1415926535897;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        while (input.hasNext()) {

            double l = input.nextDouble();
            String res = area(l);
            System.out.println(res);
        }
        input.close();
        
    }
    
    public static String area(double l){
    
        double n = 99;
        double a1 = Math.pow(l, 2) * Math.sqrt(3) / 4;
        double at = 8 * a1 / 5;
        
        String res = String.format("%.2f", at);
    
        return res;
    
    }
    
    
    

}

