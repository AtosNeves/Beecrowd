package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main1007 {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int d = input.nextInt();
    int e = (a*b)-(c*d);
    System.out.println("DIFERENCA = "+e);
    input.close();

}    
}
