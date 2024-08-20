import java.math.BigInteger;
import java.util.Scanner;
import java.lang.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l, r;
        while (input.hasNext()) {
            l = input.nextInt();
            r = input.nextInt();
            if (l + r == 0) {
                System.exit(0);
            } else {
                System.out.println(l + r);

            }
        }
        input.close();
    }
}

