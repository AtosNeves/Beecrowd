package Estruturas_e_Bilbiotecas;

import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int testes = input.nextInt();
        int v[] = new int[testes];
        int p[] = new int[testes];
        int im[] = new int[testes];
        int ci = -1;
        int contagem = 0;
        int cp = -1;
        int entrada = 0;
        for (int i = 0; i < testes; i++) {

            entrada = input.nextInt();
            if (entrada % 2 == 0) {
                cp = cp + 1;
                p[cp] = entrada;
               
            }
            if (entrada % 2 != 0) {
                ci = ci + 1;
                im[ci] = entrada;
                

            }

        }
        
        Arrays.sort(p);
        Arrays.sort(im);

        for (int i = 0; i < p.length; i++) {
            if (p[i] != 0) {
                System.out.println(p[i]);
            }
        }

        for (int i = im.length-1; i >= 0; i--) {
            if (im[i] != 0) {

                System.out.println(im[i]);

            }
            
        }
    
    }
}

