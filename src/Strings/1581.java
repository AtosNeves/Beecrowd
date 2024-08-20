package Strings;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner input = new Scanner(System.in);

		int testesTotais = input.nextInt();
		
		for (int j = 0; j < testesTotais; j++) {
			
			
			int testes = input.nextInt();
			List<String> idiomas = new ArrayList<>();
			for (int i = 0; i < testes; i++) {
				
				idiomas.add(input.next());
			}
			System.out.println(resultado(idiomas,testes));
			
		}
		
	}
	
	public static String resultado(List<String> idiomas2, int testes) {
		
		String idioma1 = idiomas2.get(0);
		for (int i = 0; i < testes; i++) {
			boolean v = false;
			if (!idioma1.equals(idiomas2.get(i))) {
				return "ingles";
				
				
				
			}
			else if (!v && i == testes - 1) {
				return idioma1;
				
				
			}
		}
		return "a";
	}
}


