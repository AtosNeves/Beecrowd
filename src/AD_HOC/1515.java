import java.util.Scanner;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String planeta = "", primeiroplaneta = "";

        int primeiro = 1000 * 1000;
        int anochegada = 0, tempo = 0;
        int testes = 1;
        int t = 2;
        int resultado = -1;
        while (t == 2) {

            testes = input.nextInt();
            if (testes == 0) {
                System.exit(0);
            } else {
                for (int i = 0; i < testes; i++) {
                    input.nextLine();
                    planeta = input.next();

                    anochegada = input.nextInt();
                    tempo = input.nextInt();
                    resultado = anochegada - tempo;

                    if (resultado < primeiro) {
                        primeiro = resultado;
                        primeiroplaneta = planeta;
                    }
                }
            }
            System.out.println(primeiroplaneta);
            anochegada = 0;
            resultado = 0;
            primeiro = 1000 * 1000;
            primeiroplaneta = "";
        }
        input.close();
        System.exit(0);
    }
}
