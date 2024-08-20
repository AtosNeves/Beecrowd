package Iniciante;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
      
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int mab= (a+b+Math.abs(a-b))/2;
        int mabc = (mab + c + Math.abs(mab - c))/2;

        
        System.out.println(mabc+" eh o maior");    
       

        }
    
}
