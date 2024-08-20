import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> cartas = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            cartas.add(input.nextInt());
        }
        System.out.println(verificador(cartas));
    }


    public static char verificador(List<Integer> cartas){
        boolean crescente = true;
        boolean decrescente = true;
        
        for (int i = 0; i <4; i++) {
            if (cartas.get(i) < cartas.get(i+1)) {


            }
            else {

                crescente = false;

            }


        }
        for (int i = 0; i <4; i++) {
            if (cartas.get(i) > cartas.get(i+1)) {


            }
            else {

                decrescente = false;

            }


        }
        if (crescente){
            return 'C';
        }
        if (decrescente){
            return 'D';
        }

return 'N';

    }





}

