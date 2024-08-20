package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int entrada, i, j, par[], impar[], p = 0, pp = 0, l = 0, m = 0, n = 0;
        par = new int[5];
        impar = new int[5];
        for (i = 0; i < 15; i++) {
            entrada = input.nextInt();

            if (entrada % 2 == 0) {
                par[p] = entrada;
                p++;

                if (p == 5) {

                    for (l = 0; l < 5; l++) {
                        System.out.println("par[" + l + "] = " + par[l]);

                        par[l] = 0;
                        p = 0;
                    }
                }
            }

            if (entrada % 2 != 0) {
                impar[pp] = entrada;
                pp++;
                if (pp == 5) {

                    for (j = 0; j < 5; j++) {
                        System.out.println("impar[" + j + "] = " + impar[j]);
                        impar[j] = 0;

                        pp = 0;
                    }
                }
            }
        }

        for (m = 0; m < 5; m++) {

            if (impar[m] == 0)
                break;
            System.out.println("impar[" + m + "] = " + impar[m]);

        }
        for (n = 0; n < 5; n++) {

            if (par[n] == 0)
                break;
            System.out.println("par[" + n + "] = " + par[n]);

        }
        input.close();
    }

}

