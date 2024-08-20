package Strings;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        
        for (int i = 0; i < testes; i++) {
            
            String entrada = input.next();
            
            int n1 = Integer.parseInt(entrada.substring(2, 4));
            int n2 = Integer.parseInt(entrada.substring(5, 8));
            int n3 = Integer.parseInt(entrada.substring(11, 13));
            
            System.out.println(n1+n2+n3);
            
            
            
            
            
        }
        
        
        
    }

}

