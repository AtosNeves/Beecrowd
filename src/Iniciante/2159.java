package Iniciante;

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double n1 = n / Math.log(n);
        double n2 = 1.25506 * n / Math.log(n);
        System.out.printf("%.1f %.1f\n",n1,n2);
    }

}

