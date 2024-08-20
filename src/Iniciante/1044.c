#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int a, b, c, d;
      scanf("%d %d", &a, &b);
      if (b > a)
      {
            d = a;
            a = b;
            b = d;

            c = a / b;

            if (a == (c * b))
            {
                  printf("Sao Multiplos\n");
            }

            else
            {
                  printf("Nao sao Multiplos\n");
            }
      }

      else
      {
            c = a / b;

            if (a == (c * b))
            {
                  printf("Sao Multiplos\n");
            }
            else
            {
                  printf("Nao sao Multiplos\n");
            }
      }

      return 0;
}
