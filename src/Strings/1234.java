package Strings;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String e;
        String f;

        // char f;
        int t, i, q = -1, v=0;
        while (input.hasNext()) {
            e = input.nextLine();
            q = -1;

            t = e.length() - 1;
            for (i = 0; i <= t; i++) {
                q = q + 1;
                if (e.charAt(i) != ' ') {

                    v = q % 2;
                }
                if (v == 0 && e.charAt(i) != ' ') {

                    System.out.print(Character.toUpperCase(e.charAt(i)));

                }
                if (v == 1 && e.charAt(i) != ' ') {

                    System.out.print(Character.toLowerCase(e.charAt(i)));
                }
                if (e.charAt(i) == ' ') {
                    System.out.print(" ");
                    q = q - 1;
                }
            }
            System.out.println();

        }
        
    }
}

