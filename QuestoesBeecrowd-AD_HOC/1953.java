
import java.util.Scanner;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String lixo, curso;
        int epr = 0, ehd = 0, intrusos = 0;
        while (input.hasNext()) {

            int testes = input.nextInt();
            input.nextLine();
            // System.out.println(testes);
            for (int i = 0; i < testes; i++) {

                lixo = input.nextLine();

                int pos = lixo.indexOf(" ");

                curso = lixo.substring(pos+1, lixo.length());

                System.out.println(curso);

                if (curso.equals("EPR")) {
                    epr = epr + 1;
                } else if (curso.equals("EHD")) {
                    ehd = ehd + 1;
                } else {
                    intrusos = intrusos + 1;
                }
            }
            System.out.println("EPR: " + epr);
            System.out.println("EHD: " + ehd);
            System.out.println("INTRUSOS: " + intrusos);
            epr = 0;
            ehd = 0;
            intrusos = 0;
        }
        input.close();
        System.exit(0);
    }
}
