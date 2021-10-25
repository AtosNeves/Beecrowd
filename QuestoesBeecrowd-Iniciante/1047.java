

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int h1, m1, s1, h2, m2, s2, tempo, hr, min;
		h1 = input.nextInt();
		m1 = input.nextInt();
		h2 = input.nextInt();
		m2 = input.nextInt();

		if (h2 <= h1 && m2 <= m1) {
			h2 = h2 + 24;
		} else if (m2 <= m1) {
			m2 = m2 + 60;
			h2 = h2 - 1;
		}

		s1 = (h1 * 3600) + (m1 * 60);
		s2 = (h2 * 3600) + (m2 * 60);

		tempo = (s2 - s1);
		hr = tempo / 3600;
		min = (tempo - (hr * 3600)) / 60;
		System.out.println("O JOGO DUROU "+hr+" HORA(S) E "+min+" MINUTO(S)");
		

	}

}
