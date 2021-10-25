#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      float arr[3], contador, aux, A, B, C;
      int i;

      scanf("%f %f %f", &arr[0], &arr[1], &arr[2]);

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

      A = arr[2], B = arr[1], C = arr[0];

      if (A >= (B + C))
      {
            printf("NAO FORMA TRIANGULO\n");
      }

      else
      {

            if (A * A == (B * B + C * C))
            {

                  printf("TRIANGULO RETANGULO\n");
            }
            if (A * A > (B * B + C * C))
            {
                  printf("TRIANGULO OBTUSANGULO\n");
            }
            if (A * A < (B * B + C * C))
            {
                  printf("TRIANGULO ACUTANGULO\n");
            }
            if (A == B && B == C && C == A)
            {
                  printf("TRIANGULO EQUILATERO\n");
            }
            if ((A == B && C != A && C != B ||
                 C == A && C != B && A != B ||
                 B == C && C != A && B != A))
            {
                  printf("TRIANGULO ISOSCELES\n");
            }
      }

      return 0;
      contador = 0;
      i = 0;
}