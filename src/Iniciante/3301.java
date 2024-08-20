package Iniciante;

import java.math.BigInteger;
import java.util.Scanner;
import java.lang.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h, z, l, i, j, aux;
    int s[]=new int[3];
    s[0]=input.nextInt();
    s[1]=input.nextInt();
    s[2]=input.nextInt();
    
    h = s[0];
    z = s[1];
    l = s[2];
    for (i = 1; i < 3; i++)
    {
        for (j = 0; j < 2; j++)
        {
            if (s[j] > s[j + 1])
            {
                aux = s[j];
                s[j] = s[j + 1];
                s[j + 1] = aux;
            }
        }
    }
    if (s[1] == h)
    {
        System.out.println("huguinho");
        
    }
    if (s[1] == z)
    {
        System.out.println("zezinho");
        
    }
    if (s[1] == l)
    {
        System.out.println("luisinho");
        
    }


    }

}

