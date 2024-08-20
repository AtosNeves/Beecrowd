
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        int dividida = 100;
        int q = 0;
        int soma = 0;
        for (int i = 0; i < testes; i++) {
            q = input.nextInt();
            dividida = dividida / q;
            soma = soma + q - 1;
        }
        System.out.println(soma);
        input.close();
        System.exit(0);
    }
}
