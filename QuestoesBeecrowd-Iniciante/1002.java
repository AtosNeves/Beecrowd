import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class URI 1002 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        double r;
        r = input.nextDouble();
        double a = (r*r) * 3.14159;
        String result = String.format("%.4f",a);
        System.out.println("A="+result);

        input.close();
    }
    
}
