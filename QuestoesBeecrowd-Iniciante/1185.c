#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      double m[12][12] = {0}, soma = 0;
      int l, c, a = 10, contagem = 0;
      char f[10];
      scanf("%s", &f);
      for (l = 0; l < 12; l++)
      {
            for (c = 0; c < 12; c++)
            {
                  scanf("%lf", &m[l][c]);
            }
      }

      for (l = 0; l < 12; l++)
      {

            for (c = 0; c <= a; c++)
            {
                  soma = soma + m[l][c];
                  contagem = contagem + 1;
            }
            a = a - 1;
      }

      //printf("%lf\n",soma);

      if (strcmp(f, "S") == 0)
      {
            printf("%.1lf\n", soma);
      }
      else if (strcmp(f, "M") == 0)
      {
            printf("%.1lf\n", soma / contagem);
      }

      return 0;
}