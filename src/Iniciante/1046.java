package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		int a, b, c, d;
		a = input.nextInt();
		b = input.nextInt();
		c = 24 - a;
		d = c + b;
		if (d > 24) {
			int res = b - a;
			System.out.println("O JOGO DUROU " + res + " HORA(S)");

		} else {
			System.out.println("O JOGO DUROU " + d + " HORA(S)");

		}
		input.close();

	}

}
