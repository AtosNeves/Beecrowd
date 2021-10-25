
import java.util.Scanner;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        float p = 0;
        int grama = 0;
        float resultado = 0;
        float menor = (float) Math.pow(100, 100);
        int testes = input.nextInt();
        for (int i = 0; i < testes; i++) {
            p = input.nextFloat();
            grama = input.nextInt();
            resultado = (p * 1000) / grama;
            if (resultado < menor) {
                menor = resultado;
            }

        }
        String menorformatado = String.format("%.2f", menor);
        System.out.println(menorformatado);
        input.close();
        System.exit(0);
    }
}
