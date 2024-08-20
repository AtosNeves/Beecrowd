package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int entrada;
		entrada = input.nextInt();
		int i, j, k, a1 = 1, a2 = 1, a3 = 1, b1 = 0, b2 = 0, b3 = 0;
		for (i = 0; i < entrada; i++) {

			for (j = 0; j < 1; j++) {

				System.out.println(a1 + " " + a2 + " " + a3);

				b1 = b1 + 1;
				b2 = a2 + 1;
				b3 = a3 + 1;
				System.out.println(b1 + " " + b2 + " " + b3);

				a1 = a1 + 1;
				a2 = a1 * a1;
				a3 = a2 * a1;
			}
		}

	}
}

