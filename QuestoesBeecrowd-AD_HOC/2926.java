import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();
        char[] natal = "Entao eh Natal".toCharArray();
        for (int i = 0; i < natal.length; i++) {
            if (natal[i] == 'a') {
                for (int j = 0; j < entrada-1; j++) {
                    System.out.print("a");
                }
            }
            System.out.print(natal[i]);
        }
        System.out.print("!");
        System.out.println();
    }
}
