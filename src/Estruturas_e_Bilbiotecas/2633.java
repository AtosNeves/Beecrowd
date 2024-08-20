package Estruturas_e_Bilbiotecas;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        
        String nome;
        int code = 0;
        while (input.hasNext()) {
            int q = input.nextInt();
            Churrasco aux = new Churrasco();
            Churrasco lista[] = new Churrasco[q];
            for (int i = 0; i < q; i++) {
               
                
                nome = input.next();
                code = input.nextInt();

                Churrasco obj = new Churrasco();

                obj.setNome(nome);
                obj.setCode(code);
                lista[i] = obj;

            }

            for (int i = 0; i < q - 1; i++) {

                for (int j = 0; j < q - 1; j++) {

                    if (lista[j].getCode() > lista[j + 1].getCode()) {

                        aux = lista[j + 1];
                        lista[j + 1] = lista[j];
                        lista[j] = aux;
                    }

                }

            }
            String[] carnes = new String[q];
            String nomeAux;
            for (int i = 0; i < q; i++) {
                nomeAux = lista[i].getNome();
                carnes[i] = nomeAux;

            }

            for (int i = 0; i < q; i++) {
                System.out.print(carnes[i]);
                if (i < q - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}

class Churrasco {

    private String nome;
    private int code;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
