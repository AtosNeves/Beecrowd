package Estruturas_e_Bilbiotecas;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String,Double> precos = new HashMap <>();
		Map<String, Integer> compras = new HashMap <>();
		int qTestes = input.nextInt();
		for (int k = 0; k <qTestes; k++) {
			
			
			int quantidadeProdutos = input.nextInt();
			for (int i = 0; i < quantidadeProdutos; i++) {
				precos.put(input.next(), input.nextDouble());
			}
			
			int qCompras = input.nextInt();
			int q = 0;
			double resultado = 0;
			for (int i = 0; i < qCompras; i++) {
				String produto = input.next();
				q = input.nextInt();
				if (precos.containsKey(produto))
					resultado = resultado + precos.get(produto) * q;
				
				
			}
			
			System.out.printf("R$ %.2f\n",resultado);
			resultado =0;
		}
	}
}

