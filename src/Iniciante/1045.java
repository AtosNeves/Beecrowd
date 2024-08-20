package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		float arr[];
		Scanner input = new Scanner(System.in);
		
		arr = new float[3];
		arr[0]=input.nextFloat();
		arr[1]=input.nextFloat();
		arr[2]=input.nextFloat();
		float contador,aux,A,B,C;
		int i;
		for (contador = 1; contador < 3; contador++)
	      {
	            for (i = 0; i < 2; i++)
	            {
	                  if (arr[i] > arr[i + 1])
	                  {

	                        aux = arr[i];
	                        arr[i] = arr[i + 1];
	                        arr[i + 1] = aux;
	                  }
	            }
	      }

	      A = arr[2]; 
	      B = arr[1];
	      C = arr[0];

	      if (A >= (B + C))
	      {
	            
	            System.out.println("NAO FORMA TRIANGULO");
	      }

	      else
	      {

	            if (A * A == (B * B + C * C))
	            {

	                  
	                  System.out.println("TRIANGULO RETANGULO");
	            }
	            if (A * A > (B * B + C * C))
	            {
	                  
	                  System.out.println("TRIANGULO OBTUSANGULO");
	            }
	            if (A * A < (B * B + C * C))
	            {
	                System.out.println("TRIANGULO ACUTANGULO");
	            	
	            }
	            if (A == B && B == C && C == A)
	            {
	                System.out.println("TRIANGULO EQUILATERO")  
	            	
	            }
	            if ((A == B && C != A && C != B ||
	                 C == A && C != B && A != B ||
	                 B == C && C != A && B != A))
	            {
	                  
	                  System.out.println("TRIANGULO ISOSCELES");
	            }
	      }

	      
	      contador = 0;
	      i = 0;
	
	      input.close();
	      }
}

