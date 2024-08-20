#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      double m[12][12], soma;
      int i, j, n;
      char f[10];
      scanf("%s", &f);
      for (i = 0; i < 12; i++)
      {
            for (j = 0; j < 12; j++)
            {
                  scanf("%lf", &m[i][j]);
            }
      }

      for (i = 1; i <= 10; i++)
      {
            if (i <= 5)
            {
                  for (j = 0; j < i; j++)
                  {
                        soma = soma + m[i][j];
                        n = n + 1;
                  }
            }

            else
            {
                  for (j = 0; j < 11 - i; j++)
                  {
                        soma = soma + m[i][j];
                        n = n + 1;
                  }
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