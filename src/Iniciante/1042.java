package Iniciante;

import java.util.Scanner;
public class Main
{

public
    static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int array[];
        int u, contador, v, i;
        array = new int[3];
        array[0] = input.nextInt();
        array[1] = input.nextInt();
        array[2] = input.nextInt();
        int a = array[0], b = array[1], c = array[2];
        for (contador = 1; contador < 3; contador++)
        {
            for (i = 0; i < 3 - 1; i++)
            {
                if (array[i] > array[i + 1])
                {

                    u = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = u;
                }
            }
        }

        for (i = 0; i < 3; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
