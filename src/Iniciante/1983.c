#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int i, j;
      long int c, t;

      scanf("%d", &j);
      float maior = 0, n;
      for (i = 0; i < j; i++)
      {
            scanf("%ld %f", &c, &n);

            if (n > maior)
            {
                  maior = n;
                  t = c;
            }
      }
      if (maior < 8)
      {
            printf("Minimum note not reached\n");
      }
      else
      {
            printf("%ld\n", t);
            maior = 0;
      }
      return 0;
}