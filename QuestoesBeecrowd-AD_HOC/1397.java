import java.math.BigInteger;
import java.util.Scanner;
import java.lang.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = -10, i;
        int a, b;
        int sa = 0, sb = 0;
        while (input.hasNext()) {
            q = input.nextInt();

            if (q == 0) {
                System.exit(0);

            }

            for (i = 0; i < q; i++) {
                a = input.nextInt();
                b = input.nextInt();

                if (a > b) {
                    sa = sa + 1;
                }
                if (a < b) {
                    sb = sb + 1;
                }
            }
            System.out.println(sa + " " + sb);

            sa = 0;
            sb = 0;
        }
        input.close();
    }
}

