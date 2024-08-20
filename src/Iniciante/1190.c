#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      double m[12][12], soma = 0, entrada;
      int i, j, c;
      char o[10];

      scanf("%s", &o);
      for (i = 0; i < 12; i++)
      {
            for (j = 0; j < 12; j++)
            {
                  scanf("%lf", &m[i][j]);
            }
      }

      for (i = 0; i < 12; i++)
      {
            for (j = 0; j < 12; j++)
            {
                  if (i < j && i > 12 - j - 1)
                  {
                        soma = soma + m[i][j];
                        c = c + 1;
                  }
            }
      }

      if (strcmp(o, "S") == 0)
      {
            printf("%.1lf\n", soma);
      }

      if (strcmp(o, "M") == 0)
      {
            printf("%.1lf\n", soma / c);
      }

      return 0;
}