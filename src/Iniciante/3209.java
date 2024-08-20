package Iniciante;

import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        for (int j = 0; j <testes; j++) {
    
    
            int quantidade = input.nextInt();
            int soma = 0;
            for (int i = 1; i <= quantidade; i++) {
                int filtro = input.nextInt();
                if (i < quantidade) {
            
                    soma = soma + filtro - 1;
                } else {
                    soma = soma + filtro;
                }
        
        
            }
    
            System.out.println(soma);
    
        }
    }
 
}
