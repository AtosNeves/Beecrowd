package Iniciante;

import java.io.IOException;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int cod1 = input.nextInt();
        int qt1 = input.nextInt();
        double valor = input.nextDouble();
        int cod2 = input.nextInt();
        int qt2 = input.nextInt();
        double valor2 = input.nextDouble();
        double soma = qt1*valor + qt2 *valor2;
        String total = String.format("%.2f", soma);
        System.out.println("VALOR A PAGAR: R$ "+total);


        input.close();
        
    }
    

}
