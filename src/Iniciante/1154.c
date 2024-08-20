#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int a, contador, q;
      contador = 0;
      a = 0;
      float soma = 0;
      q = 0;
      float media = 0;
      while (contador < 1)
      {

            scanf("%d", &a);
            if (a > 0)
            {
                  soma = soma + a;
                  q = q + 1;
            }
            else
            {
                  media = soma / q;
                  contador++;
                  printf("%.2f\n", media);
                  break;
            }
      }

      return 0;
}