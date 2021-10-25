#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int d, i, c = 0;
      float n;
      scanf("%d", &d);
      for (i = 0; i < d; i++)
      {
            scanf("%f", &n);

            while (n > 1)
            {
                  c = c + 1;
                  n = n / 2;
            }
            printf("%d dias\n", c);
            c = 0;
      }

      return 0;
}