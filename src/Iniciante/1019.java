package Iniciante;

import java.io.IOException;
import java.util.Scanner;

class OnlineJudge1019  {
 public static void main(String[] args) throws IOException{
     
     Scanner input = new Scanner(System.in);
     int m=0,h=0;
     int entrada = input.nextInt();
     while (entrada>=60) {
         m=m+1;
         entrada=entrada-60;
     }
     while (m>=60) {
         h=h+1;
         m=m-60;
     }


     System.out.println(h+":"+m+":"+entrada);

     //System.out.println(h+":"+m+":"+entrada);
     input.close();

    }
}