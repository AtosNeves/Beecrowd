package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        float h = input.nextFloat();
        float p = input.nextFloat();
        float r = h / p;
        String res = String.format("%.2f", r);
        System.out.println(res);
        input.close();
    }
}

