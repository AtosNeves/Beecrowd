import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        for (int j = 0; j < testes; j++) {

            int n1 = input.nextInt();
            String op = input.next();
            int n2 = input.nextInt();
            String lixo = input.next();
            int res = input.nextInt();
            char[] op2 = op.toCharArray();
            resultado(n1, n2, res, op2);
            
        }
        input.close();
    }

    public static void resultado(int n1, int n2, int res, char[] op) {
        if (op[0] == '+') {
            System.out.print("E");
            for (int i = 0; i < Math.abs(res - (n1 + n2)); i++) {
                System.out.print("r");
            }
            System.out.print("ou!\n");
        }
        if (op[0] == '-') {
            System.out.print("E");
            for (int i = 0; i < Math.abs(res - (n1 - n2)); i++) {
                System.out.print("r");
            }
            System.out.print("ou!\n");
        }
        if (op[0] == 'x') {
            System.out.print("E");
            for (int i = 0; i < Math.abs(res - (n1 * n2)); i++) {
                System.out.print("r");
            }
            System.out.print("ou!\n");
        }

    }

}

