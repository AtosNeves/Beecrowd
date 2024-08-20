package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int a, b, aux, i, j, soma = 0, c = 0;
		a = input.nextInt();
		b = input.nextInt();
		for (i = 1; i <= 2; i++) {

			if (b <= 0) {
				b = input.nextInt();

				i = i - 1;
			}
		}
		for (j = 0; j <= b; j++) {
			soma = soma + c;
			c = a + j;
		}
		System.out.println(soma);

	}
}

