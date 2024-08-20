package Estruturas_e_Bilbiotecas;

import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        Map<String, String> mapa = new HashMap<>();
        int quantidade = input.nextInt();
        String nacionalidade;
        String natal;
        for (int i = 0; i < quantidade; i++) {
            nacionalidade = input.next();
            natal = input.next();
            mapa.put(nacionalidade, natal);
        }
        //input.next();
        int quantidade2 = input.nextInt();

        String nome;
        String nacao;
        for (int i = 0; i < quantidade2; i++) {

            nome = input.next();
            nacao = input.next();

            if (mapa.containsKey(nacao)) {
                System.out.println(nome);
                System.out.println(mapa.get(nacao));
                System.out.println();
            }

        }
        input.close();
    }

}
