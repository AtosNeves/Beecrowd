#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int l, c, mm;
      double m[12][12] = {0}, entrada, soma;
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
            for (c = l + 1; c < 12; c++)
            {

                  mm = mm + 1;
                  soma = soma + m[l][c];
            }
      }

      if (strcmp(f, "S") == 0)
      {
            printf("%.1lf\n", soma);
      }

      if (strcmp(f, "M") == 0)
      {
            printf("%.1lf\n", soma / mm);
      }

      //printf("%lf\n",soma);

      return 0;
}