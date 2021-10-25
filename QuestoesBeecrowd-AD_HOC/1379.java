import java.math.BigInteger;
import java.util.Scanner;
import java.lang.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, menor;

        while (input.hasNext()) {
            a = input.nextInt();
            b = input.nextInt();
            if (a + b == 0) {
                System.exit(0);
            } else {
                menor = a;
                if (menor > b) {

                    menor = b;
                }
                int c = a + b;
                int resultado = calc(a, b, menor);
                System.out.println(resultado);

            }
        }
    }

    private static int calc(int a, int b, int menor) {
        int c;
        c = a + b;
        int x = 3 * menor - c;
        return x;
    }

}

