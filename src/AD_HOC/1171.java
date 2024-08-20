import java.util.*;

public class Main implements Comparator<Integer> {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> listaDeEntrada = new ArrayList <Integer>();
        List <Integer> listaVerificacao = new ArrayList <Integer>();
        boolean contem = true;
        int testes = input.nextInt();
        for (int i = 0; i < testes; i++) {
            int num = input.nextInt();
            listaDeEntrada.add(num);
            
            if (!listaVerificacao.contains(num))
                listaVerificacao.add(num);
        }
        
        Collections.sort(listaDeEntrada);
        Collections.sort(listaVerificacao);
        
       
        for (int i = 0; i < listaVerificacao.size(); i++) {
            int v = listaVerificacao.get(i);
            int c = 0;
            for (int j = 0; j <listaDeEntrada.size(); j++) {
                if (listaDeEntrada.get(j)==v){
                    c = c +1;
                }
                
            }
            System.out.println(v+" aparece "+ c+" vez(es)");
        }
        
    }
    
    
    
    @Override
    public int compare(Integer n1, Integer n2) {
        if (n1.equals(n2)){
            return 0;
        }
        else if (n1<n2){
            return -1;
        }
        else return 1;
    }
}

