package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int a, b = 0, c = 0, soma = 0, q = 0;
		a = input.nextInt();
		while (c == 0) {
			b = input.nextInt();

			if (b > a) {
				c = 2;
			}
		}

		while (soma < b) {

			soma = soma + a;
			a = a + 1;
			q = q + 1;
		}
		System.out.println(q);

		input.close();
	}
}

