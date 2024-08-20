import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();
        int valor = 0;
        while (entrada >= 101) {
            valor = valor + 5;
            entrada = entrada - 1;
        }
        while (entrada >= 31 && entrada <= 100) {
            valor = valor + 2;
            entrada = entrada - 1;
        }
        while (entrada >= 11 && entrada <= 30) {
            valor = valor + 1;
            entrada = entrada - 1;
        }
        valor = valor + 7;
        System.out.println(valor);
        input.close();
    }
}

