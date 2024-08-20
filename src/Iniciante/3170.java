package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner input = new Scanner(System.in);
		int b = input.nextInt();
		int g = input.nextInt();
		System.out.println(quantidadeBolinhas(b,g));
		
	}
	
	public static String quantidadeBolinhas(int b,int g){

		g = g/2;
		
		
		int res = b-g;
		if (res>=0){
			return "Amelia tem todas bolinhas!";
		}
		else {
			res = Math.abs(res);
			return "Faltam "+ res + " bolinha(s)";
		}
		
		
    }
 
}
