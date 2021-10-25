#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      unsigned long long a, b, i, c, d, soma = 0;

      while (scanf("%llu %llu", &a, &b) != EOF)
      {
            c = a;
            d = b;
            if (a != 0)
            {
                  for (i = a; i > 1; i--)
                  {
                        c = c * (i - 1);
                  }
            }
            if (a == 0)
            {
                  c = 1;
            }

            if (b != 0)
            {
                  for (i = b; i > 1; i--)
                  {
                        d = d * (i - 1);
                  }
            }
            if (b == 0)
            {
                  d = 1;
            }

            printf("%llu\n", c + d);
            c = 0, d = 0;
      }

      return 0;
}