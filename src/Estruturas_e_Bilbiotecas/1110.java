package Estruturas_e_Bilbiotecas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int entrada = 3;
		while(entrada >0){
			entrada = input.nextInt();
			if (entrada==0){
				System.exit(0);
			}
			List<Integer> lista = adciona(entrada);
			int descarte = descartada(entrada);
			int d = lista.size();
			
			System.out.print("Discarded cards: ");
			for (int i = 0; i <d; i++) {
				if (i<d-1) {
					System.out.print(lista.get(i)+", ");
				}
				else {
					System.out.print(lista.get(i));
				}
			}
			System.out.println();
			System.out.println("Remaining card: "+descartada(entrada));
		}
	}
    
	public static List<Integer> adciona(int entrada){
		List<Integer> lista = new ArrayList <>();
		List<Integer> descartadas = new ArrayList<>();
		for (int i = 1; i <=entrada ; i++) {
			lista.add(i);
		}
		while (lista.size()>=2){
        
			descartadas.add(lista.get(0));
			lista.remove(0);
			lista.add(lista.get(0));
			lista.remove(0);
            
            
        }
        
        return descartadas;
        
    }
    public static int descartada(int entrada){
        List<Integer> lista = new ArrayList <>();
        List<Integer> descartadas = new ArrayList<>();
        for (int i = 1; i <=entrada ; i++) {
            lista.add(i);
        }
        while (lista.size()>=2){
            
            descartadas.add(lista.get(0));
            lista.remove(0);
            lista.add(lista.get(0));
            lista.remove(0);
            
            
        }
        
        return lista.get(0);
        
    }
    
}

