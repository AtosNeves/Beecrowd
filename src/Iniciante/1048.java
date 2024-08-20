package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		double salario, salario2, s;
		salario = input.nextDouble();
		String resultado, reaj;
		if (salario >= 0 && salario <= 400) {
			salario2 = salario + (salario * 0.15);
			reaj = String.format("%.2f", salario2);

			System.out.println("Novo salario: " + reaj);

			s = salario * 0.15;
			resultado = String.format("%.2f", s);
			System.out.println("Reajuste ganho: " + resultado);

			System.out.println("Em percentual: 15 %");
		}
		if (salario >= 400.01 && salario <= 800) {
			salario2 = salario + (salario * 0.12);
			reaj = String.format("%.2f", salario2);
			s = salario * 0.12;
			resultado = String.format("%.2f", s);
			System.out.println("Reajuste ganho: " + resultado);

			System.out.println("Em percentual: 12 %");
		}
		if (salario >= 800.01 && salario <= 1200) {
			salario2 = salario + (salario * 0.10);
			reaj = String.format("%.2f", salario2);

			System.out.println("Novo salario: " + reaj);

			s = salario * 0.10;
			resultado = String.format("%.2f", s);
			System.out.println("Reajuste ganho: " + resultado);
			System.out.println("Em percentual: 10 %");
		}
		
		if (salario >= 1200.01 && salario <= 2000) {
			salario2 = salario + (salario * 0.07);
			reaj = String.format("%.2f", salario2);

			System.out.println("Novo salario: " + reaj);

			s = salario * 0.07;
			resultado = String.format("%.2f", s);
			System.out.println("Reajuste ganho: " + resultado);

			System.out.println("Em percentual: 7 %");
		}

		if (salario > 2000) {
			salario2 = salario + (salario * 0.04);
			reaj = String.format("%.2f", salario2);

			System.out.println("Novo salario: " + reaj);

			s = salario * 0.04;
			resultado = String.format("%.2f", s);
			System.out.println("Reajuste ganho: " + resultado);

			System.out.println("Em percentual: 4 %");
		}

	}
}

