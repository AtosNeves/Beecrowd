#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      double m[12][12], n;
      int l, c, i;
      double soma = 0;
      char f[10];
      scanf("%s", &f);
      for (l = 0; l < 12; l++)
      {
            for (c = 0; c < 12; c++)
            {

                  scanf("%lf", &m[l][c]);
            }
      }

      for (l = 0; l <= 4; l++)
      {
            for (c = l + 1; c <= 10 - l; c++)
            {
                  soma = soma + m[l][c];
                  n = n + 1;
            }
      }

      if (strcmp(f, "S") == 0)
      {
            printf("%.1lf\n", soma);
      }

      if (strcmp(f, "M") == 0)
      {
            printf("%.1lf\n", soma / n);
      }

      return 0;
}