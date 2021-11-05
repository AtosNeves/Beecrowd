import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int a = input.nextInt();
            int b = input.nextInt();
            int contador = 0;
            for (int i = a; i <= b; i++) {
                if (verificador(i) == true) {
                    contador = contador + 1;
                }
            }

            System.out.println(contador);

        }
    }
    static boolean verificador(int entrada) {

        String entradaString = Integer.toString(entrada);
        char[] entradaFinal = entradaString.toCharArray();
        boolean x = true;
        for (int i = 0; i < entradaString.length(); i++) {

            char v = entradaFinal[i];
            for (int j = 0; j < entradaFinal.length-1; j++) {
                if (i == j) {
                    j = j + 1;
                }

                if (v == entradaFinal[j]) {
                    x = false;
                    return false;

                }
            }

        }

        return true;

    }

}

