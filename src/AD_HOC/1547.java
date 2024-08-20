import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int quantidade = input.nextInt();
        for (int k = 0; k < quantidade; k++) {

            int q = input.nextInt();
            int escolhido = input.nextInt();

            int[] v = new int[q];
            for (int i = 0; i < q; i++) {
                v[i] = input.nextInt();
            }
            int verificar = 10000;
            int menor = 0;
            for (int i = 0; i < q; i++) {
                if ((Math.abs(escolhido - v[i]) < verificar)) {
                    verificar = Math.abs(escolhido - v[i]);
                    menor = i + 1;
                }
            }

            System.out.println(menor);
            verificar = 10000;
            menor = 0;

        }

    }
}

