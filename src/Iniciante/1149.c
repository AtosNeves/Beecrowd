#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main(void)
{
      setlocale(LC_ALL, "pt-br");
      int a, b, aux, i, j, soma = 0, c = 0;

      scanf("%d %d", &a, &b);

      for (i = 1; i <= 2; i++)
      {

            if (b <= 0)
            {
                  scanf("%d", &b);
                  i = i - 1;
            }
      }
      for (j = 0; j <= b; j++)
      {
            soma = soma + c;
            c = a + j;
      }

      printf("%d\n", soma);

      return 0;
}