package Estruturas_e_Bilbiotecas;

import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Map<String, String> mapa = new HashMap<>();
        mapa.put("brasil", "Feliz Natal!");
        mapa.put("alemanha", "Frohliche Weihnachten!");
        mapa.put("austria", "Frohe Weihnacht!");
        mapa.put("coreia", "Chuk Sung Tan!");
        mapa.put("espanha", "Feliz Navidad!");
        mapa.put("grecia", "Kala Christougena!");
        mapa.put("estados-unidos", "Merry Christmas!");
        mapa.put("inglaterra", "Merry Christmas!");
        mapa.put("australia", "Merry Christmas!");
        mapa.put("portugal", "Feliz Natal!");
        mapa.put("suecia", "God Jul!");
        mapa.put("turquia", "Mutlu Noeller");
        mapa.put("argentina", "Feliz Navidad!");
        mapa.put("chile", "Feliz Navidad!");
        mapa.put("mexico", "Feliz Navidad!");
        mapa.put("antardida", "Merry Christmas!");
        mapa.put("canada", "Merry Christmas!");
        mapa.put("irlanda", "Nollaig Shona Dhuit!");
        mapa.put("belgica", "Zalig Kerstfeest!");
        mapa.put("italia", "Buon Natale!");
        mapa.put("libia", "Buon Natale!");
        mapa.put("siria", "Milad Mubarak!");
        mapa.put("marrocos", "Milad Mubarak!");
        mapa.put("japao", "Merii Kurisumasu!");
        
        while (input.hasNext()) {
            String pais = input.next();
            if (mapa.containsKey(pais)) {
                System.out.println(mapa.get(pais));
            }
            
            else{
            System.out.println("--- NOT FOUND ---");}
        }

    }

}
