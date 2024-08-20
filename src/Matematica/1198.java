package Matematica;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        long  a, b;

      while (input.hasNext())
      {         a = input.nextLong();
        b = input.nextLong();
            if (a >= b)
            {       
                System.out.println(a-b);
                  
            }
            else
            {       
                System.out.println(b-a);
                  
            }
      }
        input.close();
    }
}

