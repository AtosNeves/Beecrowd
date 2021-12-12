import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();
        int q = input.nextInt();
        int chamado = input.nextInt();
        for (int i = 0; i <= q; i++) {
            lista.add(input.nextLine());
        }
        Collections.sort(lista);
        System.out.println(lista.get(chamado));
        input.close();

    }

}

