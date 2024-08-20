import java.io.IOException;
import java.util.Scanner;


public class URI 1003 {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int a;
    int b;
    a = input.nextInt();
    b = input.nextInt();
    int s = a +b;
    System.out.println("SOMA = "+s);
    input.close();
    }    
}
