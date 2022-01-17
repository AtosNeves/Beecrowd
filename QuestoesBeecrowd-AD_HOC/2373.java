import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        int resultado = 0;
        for (int i = 0; i <testes; i++) {
            int latas = input.nextInt();
            int copos = input.nextInt();
            if (copos<latas){

                resultado = resultado + copos;


            }
        }
        System.out.println(resultado);
    }
}

