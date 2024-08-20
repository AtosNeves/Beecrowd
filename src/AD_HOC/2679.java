import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int a= input.nextInt();

        
        
        if (a % 2 == 0)
        {
            System.out.println(a+2);  
            
        }
        if (a % 2 != 0)
        {       System.out.println(a+1);
              
        }
        
        input.close();
    }
}

