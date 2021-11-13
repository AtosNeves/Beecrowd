import java.util.Scanner;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int res = 1;
        while (input.hasNext()) {
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            int n3 = input.nextInt();
            System.out.println(cubic(n1, n2, n3));

        }
        input.close();
        System.exit(0);
    }

    public static int cubic (int n1, int n2, int n3) {

        if (n1 == 0 && n2 == 0 && n3 == 0) {
            System.exit(0);
        } 
            double fim = Math.floor(Math.cbrt(n1 * n2 * n3)); 
            String fim2 = String.format("%.0f", fim);
            int fim3 = Integer.parseInt(fim2);
            
            return fim3;

        
        
    }
}
