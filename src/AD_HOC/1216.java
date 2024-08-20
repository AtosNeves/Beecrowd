import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double soma = 0;
        String nome, d;
        double contador = 0;
        while (input.hasNext())

        {
            nome = input.nextLine();

            d = input.nextLine();
            soma = soma + Integer.parseInt(d);

            contador = contador + 1;
        }
        double resultado = soma / contador;
        System.out.printf("%.1f\n", resultado);

    }
}

