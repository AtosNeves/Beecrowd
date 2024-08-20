package Matematica;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int d, i, c = 0;
        float n;
        d = input.nextFloat();
        
        for (i = 0; i < d; i++)
        {
            n = input.nextFloat();
            
  
              while (n > 1)
              {
                    c = c + 1;
                    n = n / 2;
              }
              System.out.println(c+" dias");
              
              c = 0;
            }
        input.close();
    }
}

