import java.io.IOException;
import java.util.Scanner;

class Main {
    static final double PI = 3.1415926535897;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        int[] v = new int[testes];
        int s = 0;
        for (int i = 0; i < testes; i++) {
            v[i] = input.nextInt();
            s = s + v[i];
        }
        System.out.println(sec(v, s));
    }

    public static int sec(int[] v, int s) {
        s = s / 2;
        int s2 = 0;
        int s1 = 0;
        int c = 0;
        int m = 0;
        for (int i = 0; i < v.length - 1; i++) {
            m = m + v[i];
            if (m == s) {
                return i + 1;
            }

        }
        return 0;
    }
}
