import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        int testes = 0;
        int escolha = 0;
        for (int i = 0; i < q; i++) {
            testes = input.nextInt();
            for (int j = 0; j < testes; j++) {
                escolha = input.nextInt();
                System.out.println(feedback(escolha));
            }
        }
    }

    static String feedback(int entrada) {

        switch (entrada) {
        case 1:
            return "Rolien";
        case 2:
            return "Naej";
        case 3:
            return "Elehcim";
        case 4:
            return "Odranoel";

        default:
            break;
        }

        return "ds";

    }
}

