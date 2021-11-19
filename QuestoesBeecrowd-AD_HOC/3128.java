
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Main {
    static final double PI = 3.1415926535897;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a < 6 || b < 6) {
            System.out.println("NO");

        } else if ((a >= 18 && b >= 6) || ((b >= 18 && a >= 6))) {
            System.out.println("YES");
        } else if ((a >= 14 && b >= 14)) {
            System.out.println("YES");

        } else {
            System.out.println("NO");

        }
    }

}

