package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.next();
        double salario = input.nextDouble();
        double vendas = input.nextDouble();

        double total = (double) (((vendas*0.15)+salario));
        String total2 = String.format("%.2f", total);
        System.out.println("TOTAL = R$ "+total2);
        input.close();
    }
}