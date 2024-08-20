package Iniciante;

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Robo r1 = new Robo();
        r1.setPonto(input.nextInt());
        System.out.println(r1.ponto(r1.getPonto()));
    }
}

class Robo {

    private int ponto;

    /**
     * @return int return the ponto
     */
    public int getPonto() {
        return ponto;
    }

    /**
     * @param ponto the ponto to set
     */
    public void setPonto(int ponto) {
        this.ponto = ponto;
    }

    static int ponto(int p){
    
    
        if (p<=800) {
            return 1;
        }
    if (p>800&&p<=1400) {
        return 2;
    }
    if (p>1400&&p<=2000) {
        return 3;
    }
    
    
    return 0;
    
    }

    }
