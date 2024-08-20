package Strings;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        for (int i = 0; i <= testes; i++) {
            int n1 = 0;
            int n2 = 0;
            int n = 0;
            String hame = input.nextLine();
            
            char[] hamekame = hame.toCharArray();
            for (int j = 0; j < hamekame.length; j++) {
                    if(hamekame[j]=='k'){
                    
                        n = j;
                    }
            }
            
            for (int j = 0; j <n; j++) {
                if (hamekame[j]=='a') {
                    n1 = n1 + 1;
                    if (hamekame[j]=='m') {
                        break;
                    }
                }
            }
            for (int j = n1+1; j < hame.length(); j++) {
                if (hamekame[j]=='a') {
                    n2 = n2 + 1;
                }
            }
            
            if (n1 != 0 && n2 != 0) {
                System.out.print("k");
                int n3 = n1 * n2;
                for (int j = 0; j < n3 ; j++) {
                    System.out.print("a");
                }

                System.out.println();
                n1 = 0;
                n2 = 0;
                n3 = 0;
                n = 0;
            }
            
        }
    }

}

