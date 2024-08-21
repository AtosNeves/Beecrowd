import java.util.*;
import java.math.*;


    class Main{

    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
            int dBola= input.nextInt();

            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            String res = verificador(dBola,a,b,c);
            
            System.out.println(res);
    



    }



        static String verificador(int dBola, int a, int b, int c){

                boolean da = dBola <=a;
                boolean db = dBola <=b;
                boolean dc = dBola <=c;
                if (da&& db && dc)  {
                    return "S";
 
                }

                else
                {
                    return "N";
                }





                

        }
    }
