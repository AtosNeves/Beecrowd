package Iniciante;

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {

            int q = input.nextInt();
            int s = 0;
            int n = 0;
            int entrada = 0;
            for (int i = 0; i < q; i++) {

                entrada = input.nextInt();

                switch (entrada) {
                case 0:
                    n = n + 1;
                    break;
                case 1:
                    s = s + 1;
                    break;
                default:
                    break;
                }

            
            }
        
            boolean res = verificador(s, q);
        if (res==true) {
            System.out.println("impeachment");
        }
        if(res==false){
        
        System.out.println("acusacao arquivada");
        
        }
        
        
        }
    }
    
    static boolean verificador (double s,double t){
    
    
    double resultado = (t/3)*2;
    
    
    
    
    if (s>=resultado) {
        return true;
    }
    if (s<resultado) {
        return false;
    }
    return false;
        
    }
}
    

    
