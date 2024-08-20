import java.math.BigInteger;
import java.util.Scanner;
import java.lang.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, q, e, f = 1, m = 0, j = 0;
        int retu = 0;
        while (f == 1) {

            q = input.nextInt();
            switch (q) {
                case 0:

                    System.exit(0);

                default:
                    for (i = 0; i < q; i++) {

                        e = input.nextInt();
                        switch (e) {
                            case 0:
                                m = m + 1;
                                break;
                            case 1:
                                j = j + 1;
                                break;
                            default:
                                break;

                        }
                    }
                    System.out.println("Mary won " + m + " times and John won " + j + " times");

                    m = 0;
                    j = 0;
                    break;
            }
        }

    }

}

