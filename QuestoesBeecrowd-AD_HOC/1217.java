
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        String feira;
        char com;
        int soma = 1;
        input.nextLine();
        char space = ' ';
        float peso = 0;
        float pesof = 0;
        float soma2 = 0;
        for (int i = 0; i < testes; i++) {
            soma = 1;
            peso = input.nextFloat();
            input.nextLine();
            feira = input.nextLine();
            for (int j = 0; j < feira.length(); j++) {
                com = feira.charAt(j);
                if (Character.compare(com, space) == 0) {
                    soma = soma + 1;
                }

            }
            System.out.println("day " + (i + 1) + ": " + soma + " kg");
            pesof = pesof + peso;
            soma2 = soma2 + soma;

            // System.out.println(soma);
        }
        String res1 = String.format("%.2f", soma2 / testes);
        String res2 = String.format("%.2f", pesof / testes);
        System.out.println(res1 + " kg by day");
        System.out.println("R$ " + res2 + " by day");
        input.close();
        System.exit(0);
    }
}
