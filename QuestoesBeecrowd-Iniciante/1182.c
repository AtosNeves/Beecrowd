#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int entrada;

      scanf("%d", &entrada);
      int l = 0, c = 0;
      double m[12][12] = {0};
      double soma = 0.0;
      double media = 0.0;

      char op[5];

      scanf(" %s", &op);

      for (l = 0; l < 12; l++)

      {
            for (c = 0; c < 12; c++)
            {
                  scanf("%lf", &m[l][c]);
            }
      }

      for (c = 0; c < 12; c++)
      {
            soma = soma + m[c][entrada];
      }

      media = soma / 12.0;

      //printf("%lf\n",soma);

      if (strcmp(op, "S") == 0)
      {
            printf("%.1lf\n", soma);
      }
      if (strcmp(op, "M") == 0)
      {
            printf("%.1lf\n", media);
      }

      return 0;
}