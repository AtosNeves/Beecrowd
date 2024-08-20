package Iniciante;

import java.io.IOException;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int h = input.nextInt();
		int e = input.nextInt();
		int a = input.nextInt();
		int o = input.nextInt();
		int w = input.nextInt();
		int x = input.nextInt();
		
		if (eBem(h, e, a, x) > eMau(o, w)) {
			System.out.println("Middle-earth is safe.");
			
		}
		else{
			System.out.println("Sauron has returned.");
		}
		
		
	}
	
	public static int eBem(int h, int e, int a, int x) {
		return (h + e + a + x);
	}
	
	public static int eMau(int o, int w) {
		return (o + w);
	}
}
