package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int teste, maior = 0, a = 0, lesmas;

        int i;

        while (input.hasNext()) {
            teste = input.nextInt();
            for (i = 0; i < teste; i++) {
                lesmas = input.nextInt();

                if (lesmas > maior) {
                    maior = lesmas;
                }
            }
            if (maior < 10)
                a = 1;
            else if (maior >= 10 && maior < 20) {
                a = 2;
            } else
                a = 3;
            System.out.println(a);

            maior = 0;
        }

    }

}

