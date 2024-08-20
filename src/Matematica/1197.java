package Matematica;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int v, t;
        while (input.hasNext())
        {       v = input.nextInt();
                t = input.nextInt();
                System.out.println(v*t*2);
              
        }
        input.close();
    }
}

