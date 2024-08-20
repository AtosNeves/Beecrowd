package Strings;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
      
          String led;
        
          int i, w = 0, soma = 0, a = 0;
            a = input.nextInt();
          
        
          while (w <= a)
          {
              led = input.nextLine();
            int l = led.length();
            
        
            for (i = 0; i < l; i++)
            {
        
              if (led.charAt(i) == '0')
              {
                soma = soma + 6;
              }
        
              else if (led.charAt(i) == '1')
              {
                soma = soma + 2;
              }
        
              else if (led.charAt(i)== '2')
              {
                soma = soma + 5;
              }
              else if (led.charAt(i)== '3')
              {
                soma = soma + 5;
              }
              else if (led.charAt(i)== '4')
              {
                soma = soma + 4;
              }
              else if (led.charAt(i)== '5')
              {
                soma = soma + 5;
              }
              else if (led.charAt(i)== '6')
              {
                soma = soma + 6;
              }
              else if (led.charAt(i)== '7')
              {
                soma = soma + 3;
              }
              else if (led.charAt(i)== '8')
              {
                soma = soma + 7;
              }
              else if (led.charAt(i)== '9')
              {
                soma = soma + 6;
              }
              if (i == (l - 1))
              {
                  System.out.println(soma +" leds");
                
                soma = 0;
                break;
              }
            }
        
            w = w + 1;
          }
        
        
    }
}

