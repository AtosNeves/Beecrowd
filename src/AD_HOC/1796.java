import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static final double PI = 3.1415926535897;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        int n = 0;
        int s = 0;
        int entrada = 0;

        for (int i = 0; i < q; i++) {
            entrada = input.nextInt();
            switch (entrada) {
            case 0:
                s = s + 1;
                break;
            case 1:
                n = n + 1;
                break;
            default:
                break;
            }
        }
        System.out.println(resultado(s, n));
    }

    public static char resultado(int s, int n) {

        if (s > n) {
            return 'Y';
        } else {
            return 'N';
        }
    }

}

