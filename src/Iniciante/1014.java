package Iniciante;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Double d = input.nextDouble();
        Double c = input.nextDouble();

        Double consumo = d/c;

        String consumof = String.format("%.3f", consumo);
        System.out.println(consumof+" km/l");
        input.close();
        






    }
}
