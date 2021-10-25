#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int a, b, c, i, contador = 0;
      int notas[7] = {2, 5, 10, 20, 50, 100};
      while (scanf("%d %d", &a, &b) && (a && b) > 0)
      {
            contador = 0;
            c = b - a;

            for (i = 5; i >= 0; i--)
            {
                  if (c >= notas[i])
                  {
                        c = c - notas[i];
                        contador = contador + 1;
                  }

                  if (contador == 2)
                  {
                        break;
                  }
            }
            if (c == 0 && contador == 2)
            {
                  printf("possible\n");
            }
            else
            {
                  printf("impossible\n");
            }
      }
      //printf("%d\n", c);
      return 0;
}