import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner input = new Scanner(System.in);
		int testesTotais = input.nextInt();
		
		for (int j = 0; j <testesTotais; j++) {
		
		
		int testes = input.nextInt();
		List<String> idiomas = new ArrayList<>();
		for (int i = 0; i <testes; i++) {
			
			idiomas.add(input.next());
		}
		String idioma1 = idiomas.get(0);
			for (int i = 0; i <testes; i++) {
				boolean v = false;
				if (!idioma1.equals(idiomas.get(i))) {
					System.out.println("ingles");
					v = true;
					break;
				}
				if (!v&&i==testes-1){
					System.out.println(idioma1);
					idiomas.clear();
				}
			}
			
		}
    }
 
}
