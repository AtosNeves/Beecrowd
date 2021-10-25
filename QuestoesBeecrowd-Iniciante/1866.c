#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int e, i, s = 0, a = 1, b = -1, c, d = 0;
      scanf("%d", &c);

      while (d < c)
      {

            scanf("%d", &e);
            for (i = 0; i < e; i++)
            {

                  if (i % 2 == 0)
                  {
                        s = s + a;
                  }

                  if (i % 2 != 0)
                  {
                        s = s + b;
                  }
            }

            printf("%d\n", s);
            d = d + 1;
            s = 0;
      }

      return 0;
}