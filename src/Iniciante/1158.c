#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");

      int a, b, c, j, soma;
      int d = 0;
      soma = 0;
      scanf("%d", &a);
      for (d = 0; d < a; d++)
      {

            scanf("%d %d", &b, &c);

            if (b % 2 == 0)
            {
                  b = b + 1;
            }
            for (j = 0; j < c; j++)
            {
                  soma = soma + b;
                  b = b + 2;
            }

            printf("%d\n", soma);
            soma = 0;
      }

      return 0;
}
