import java.math.BigInteger;
import java.util.Scanner;
import java.lang.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b;

        b = input.nextFloat();
        a = input.nextFloat();
        float c = a - b;
        c = a / c;
        c = (float) Math.ceil(c);
        System.out.printf("%.0f", c);
        System.out.println();

        input.close();
    }

}

