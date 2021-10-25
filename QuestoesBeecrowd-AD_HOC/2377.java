
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = 0, d = 0;
        int k = 0, p = 0;
        int pe = 0;

        l = input.nextInt();
        d = input.nextInt();
        k = input.nextInt();
        p = input.nextInt();
        int ll = l;
        while (l >= d) {

            l = l - d;
            pe = pe + p;
            
        }
        int custo = ll * k;
        custo = custo + pe;
        System.out.println(custo);
        input.close();
        System.exit(0);
    }
}
