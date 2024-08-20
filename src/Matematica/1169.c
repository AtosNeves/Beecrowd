#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int a, i, q;
      double g = 0, v = 1, r;

      scanf("%d", &q);
      while (q)
      {
            scanf("%d", &a);

            for (i = 1; i <= a; i++)
            {
                  v = v * 2;
            }

            //printf("%d\n", v);
            //v = 0;
            g = v / 12;
            g = g / 1000;
            r = floor(g);
            printf("%.0lf kg\n", r);
            g = 0,
            v = 1;
            q = q - 1;
      }
      return 0;
}