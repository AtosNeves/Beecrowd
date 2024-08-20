import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class URI 1005{  
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = (a*3.5+b*7.5)/11;
        
        String c2 = String.format("%.5f",c);
        
        System.out.println("MEDIA = "+c2);
        input.close();
 }    
}
