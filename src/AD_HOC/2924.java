import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
    BigInteger a = input.nextBigInteger();
    BigInteger b = input.nextBigInteger();
    BigInteger c = a.add(b);
    System.out.println(c);
 
    }
 
}
