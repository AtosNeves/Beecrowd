package Iniciante;

import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int senha = 0;
        int a = 1;
        while (input.hasNext()) {

            senha = input.nextInt();
            if (senha > 9999) {
                System.exit(0);
            } else {

                System.out.println(senha - 1);

            }

        }
    }
}

