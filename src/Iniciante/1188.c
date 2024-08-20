#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      double m[12][12] = {0}, soma = 0;
      int i, j, n = 0;
      char f[10];

      scanf("%s", &f);
      for (i = 0; i < 12; i++)
      {
            for (j = 0; j < 12; j++)
            {
                  scanf("%lf", &m[i][j]);
            }
      }
      for (i = 7; i <= 11; i++)
      {
            for (j = 11 - i + 1; j <= i - 1; j++)
            {
                  soma = soma + m[i][j];
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