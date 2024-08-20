import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;


public class Main {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		List<Integer> listaSorteados = new ArrayList<>();
		List<Integer> listaEscolhidos = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			listaSorteados.add(input.nextInt());
		}
		for (int i = 0; i <6; i++) {
			listaEscolhidos.add(input.nextInt());
		}
		System.out.println(verificador(listaSorteados,listaEscolhidos));
	}
	
	
	public static String verificador(List sorteados, List escolhidos){
		int c = 0;
		Integer comparador =0;
		for (int i = 0; i <6; i++) {
			comparador = (int) escolhidos.get(i);
			for (int j = 0; j <6 ; j++) {
				if (escolhidos.get(i).equals(sorteados.get(j))){
					c = c+1;
				}
			}
		}
		
		switch (c){
		
			case 3:
				return "terno";
				
			case 4:
				return "quadra";
				
			case 5:
				return "quina";
			case 6:
				return "sena";
			default:
				return "azar";
		
		}
		
	}
	
	
	
	
	
	

}

