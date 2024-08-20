package Iniciante;

import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int n, a, b;
        n = input.nextInt();
        a = input.nextInt();
        b = input.nextInt();

        if (a + b <= n) {
            System.out.println("Farei hoje!");

        } else {
            System.out.println("Deixa para amanha!");

        }

    }
}

