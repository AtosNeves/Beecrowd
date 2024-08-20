package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static final double PI = 3.1415926535897;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
       
int h1=input.nextInt();
int m1=input.nextInt();

int h2=input.nextInt();
int m2=input.nextInt();

int tempo=0;
int hr=0;
int min=0;

  

  if (h2 <= h1 && m2 <= m1) {
    h2 = h2 + 24;
  } 
    else if (m2 <= m1) {
    m2 = m2 + 60;
    h2 = h2 - 1;
  }

  int s1 = (h1 * 3600) + (m1 * 60);
 int s2 = (h2 * 3600) + (m2 * 60);

  tempo = (s2 - s1);
  hr = tempo / 3600;
  min = (tempo - (hr * 3600)) / 60;
  System.out.println("O JOGO DUROU "+hr+" HORA(S) E "+min+" MINUTO(S)");
        
    }

}

