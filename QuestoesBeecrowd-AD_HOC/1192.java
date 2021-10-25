
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        String entrada;
        String aa;
        String bb;
        int a = 0, b = 0;
        input.nextLine();
        for (int i = 0; i < testes; i++) {
            entrada = input.nextLine();
            a = Character.getNumericValue(entrada.charAt(0));
            b = Character.getNumericValue(entrada.charAt(2));
            if (a == b) {
                System.out.println(a * b);

            } else {
                if (Character.isUpperCase(entrada.charAt(1))) {
                    System.out.println(b - a);
                }
                if (Character.isLowerCase(entrada.charAt(1))) {
                    System.out.println(b + a);
                }
            }
        }
        // System.out.println(a + " " + b);
        input.close();
        System.exit(0);
    }
}
