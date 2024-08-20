package Iniciante;

import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa obj = new Pessoa(); 
        String nome = input.nextLine();
        obj.setNome(nome);
        //System.out.println(obj.getNome().length());
        if (obj.getNome().length()<=80) {
            System.out.println("YES");
            
        }
        if (obj.getNome().length() > 80) {
            System.out.println("NO");

        }
       
       
       
    }
}

class Pessoa {

private String nome;



    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}
