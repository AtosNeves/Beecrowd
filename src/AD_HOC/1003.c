#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int h1, m1, h2, m2, resto;

      while (scanf("%d %d %d %d", &h1, &m1, &h2, &m2))
      {
            if ((h1 + h2 + m1 + m2) == 0)
            {
                  return 0;
            }

            h1 = h1 * 60;
            h2 = h2 * 60;
            h1 = h1 + m1;
            h2 = h2 + m2;
            if (h1 > h2)
            {
                  h1 = h1 - 24 * 60;

                  resto = h1 + h2;
            }
            if (h2 > h1)
            {
                  resto = h2 - h1;
            }

            printf("%d\n", resto);
      }
      return 0;
}