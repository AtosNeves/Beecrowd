package Iniciante;

import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int a, b, c, d;
		a = input.nextInt();
		b = input.nextInt();
		if (b > a) {
			d = a;
			a = b;
			b = d;

			c = a / b;

			if (a == (c * b)) {

				System.out.println("Sao Multiplos");
			}

			else {

				System.out.println("Nao sao Multiplos");
			}
		}

		else {
			c = a / b;

			if (a == (c * b)) {

				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");

			}
		}

	}

}

