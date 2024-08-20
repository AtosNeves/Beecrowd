package Iniciante;

import java.util.Scanner;

public class a1020 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   
    int entrada = input.nextInt();
    int mes=0,dia=0,ano=0;
    while(entrada>=365){
        ano = ano+1;
        entrada=entrada-365;
    }     
    while(entrada>=30){
        mes=mes+1;
        entrada=entrada-30;
    }

    System.out.println(ano+" ano(s)");
    System.out.println(mes+" mes(es)");
    System.out.println(entrada+" dia(s)");


    }
    
}
