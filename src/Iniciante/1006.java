import java.io.IOException;
import java.util.Scanner;


public class URI 1006 {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
    float a = input.nextFloat();
    float b = input.nextFloat();
    float c = input.nextFloat();
    float d = ((a*2)+(b*3)+(c*5))/10;
    String media = String.format("%.1f", d);    
    System.out.println("MEDIA = "+media);
    input.close();
    }
}
