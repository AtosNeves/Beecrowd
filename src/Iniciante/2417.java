package Iniciante;

import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        String entrada;
        
        for (int i = 0; i < q; i++) {
            entrada = input.next();
            double resultado = entrada.length() * 0.01;
            System.out.printf("%.2f\n",resultado);
        
        
        }

        input.close();
    }
}
