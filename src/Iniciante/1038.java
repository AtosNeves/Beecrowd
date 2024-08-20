package Iniciante;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double quantidade;
        int codigo;
        Double total;
        codigo = input.nextInt();
        quantidade = input.nextDouble();

        switch (codigo) {
            case 1:
                total = quantidade * 4;
                String t1 = String.format("%.2f", total);
                System.out.println("Total: R$ " + t1);
                break;
            case 2:
                total = quantidade * 4.5;
                String t2 = String.format("%.2f", total);
                System.out.println("Total : R$ " + t2);
                break;
            case 3:
                total = quantidade * 5;
                String t3 = String.format("%.2f", total);
                System.out.println("Total: R$ : " + t3);
                break;
            case 4:
                total = quantidade * 2;
                String t4 = String.format("%.2f", total);
                System.out.println("Total : R$ " + t4);
                break;
            case 5:
                total = quantidade * 1.5;
                String t5 = String.format("%.2f", total);
                System.out.println("Total : R$ " + t5);
                break;

            default:
                break;
        }

    }
}
