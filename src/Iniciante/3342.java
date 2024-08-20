package Iniciante;

import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

class Student {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();
        entrada = entrada * entrada;

        if (veri(entrada)) {
            System.out.println(entrada / 2 + " casas brancas e " + entrada / 2 + " casas pretas");
        }
        if (veri(entrada) == false) {

            entrada = entrada + 1;
            System.out.println(entrada / 2 + " casas brancas e " + (entrada / 2 - 1) + " casas pretas");

        }

    }

    public static boolean veri(int e) {

        if (e % 2 == 0) {

            return true;
        }

        else {

            return false;
        }

    }

}

