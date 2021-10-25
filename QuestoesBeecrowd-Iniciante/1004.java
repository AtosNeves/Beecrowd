import java.io.IOException;
import java.util.Scanner;

public class URI 1004{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c;
        
        c = a * b;
        System.out.println("PROD = "+c);
        input.close();
        
    }
}
