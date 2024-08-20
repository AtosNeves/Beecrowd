package Matematica;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long entrada = input.nextLong();
		double saida = quantidade(entrada);
		System.out.printf("%.0f\n",saida);
	}
	
	public static double quantidade(long entrada){
		
		return ((double) entrada *((double) entrada -3)/2);
		
		
	}
	
	
}

