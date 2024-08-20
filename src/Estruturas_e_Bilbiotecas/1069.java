package Estruturas_e_Bilbiotecas;

import java.util.*;

public class Main<E> extends ArrayList<E> {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        
        String entrada ="";
        for (int j = 0; j < testes; j++) {
            entrada = input.next();
            char[] nomes = entrada.toCharArray();
            List <Character> itens = new ArrayList <>();
            for (char nome : nomes) {
                if (nome != '.') {
                    itens.add(nome);
                }
            }
            int c = 0;
            int d = 0;
            int q = itens.size();
            boolean verificador = true;
           for (int k = 0; k <=q; k++) {
                
            
                for (int i = 0; i < itens.size()-1 ; i++) {
                    if (itens.get(i) == '<' && itens.get(i+1) == '>') {
                        itens.subList(i+0 , i+2).clear();
                        c = c + 1;
                        
                    }
                }
               
            }
            
            System.out.println(c);
            c=0;
        }
    }

}

