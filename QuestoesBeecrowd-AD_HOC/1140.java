import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        
        while (input.hasNext()) {

            String entrada = input.nextLine();
            entrada = entrada.toLowerCase();
            if (entrada.charAt(0) == '*') {
                System.exit(0);
            }
            if(entrada!="*") {
            
                System.out.println(verificador(entrada));
            }
            
        }
    }
    static char verificador(String entrada) {
        char resultado = 'Y';
        char inicio = entrada.charAt(0);
        for (int i = 0; i < entrada.length() - 1; i++) {

            if (entrada.charAt(i) == ' ' && entrada.charAt(i + 1) != inicio) {

                resultado = 'N';

            }

        }

        return resultado;

    }

}

