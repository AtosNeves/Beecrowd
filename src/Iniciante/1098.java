package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		int aa, bb;
		int a, b;
		a = 0;
		b = 1;
		int i, j;
		System.out.println("I=0 J=1");
		System.out.println("I=0 J=2");
		System.out.println("I=0 J=3");

		bb = 2;
		aa = 2;
		for (j = 0; j < 4; j++) {

			b = 1;

			for (i = 1; i <= 3; i++) {
				System.out.println("I=" + a + "." + aa + " J=" + b + "." + bb);

				b = b + 1;
			}

			bb = bb + 2;
			aa = aa + 2;
		}
		System.out.println("I=1 J=2");
		System.out.println("I=1 J=3");
		System.out.println("I=1 J=4");

		a = 1;
		b = 2;
		bb = 2;
		aa = 2;

		for (j = 0; j < 4; j++) {

			b = 2;

			for (i = 1; i <= 3; i++) {
				System.out.println("I="+a+"."+aa+" J="+b+"."+bb);
				
				b = b + 1;
			}

			bb = bb + 2;
			aa = aa + 2;
		}
		System.out.println("I=2 J=3");
		System.out.println("I=2 J=4");
		System.out.println("I=2 J=5");
		

	}
}

