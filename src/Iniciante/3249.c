#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int q, i, e, v = 0, j, d = 1;

      char pp[1001];

      scanf("%d", &q);

      for (j = 0; j < q; j++)
      {

            scanf("%s", &pp);
            e = strlen(pp) - 1;

            for (i = 1; i <= e; i++)
            {

                  if (pp[i - 1] == 'C' && pp[i] == 'D')
                  {
                        d = d - 1;
                  }
            }

            if (d == 1)
            {
                  v = v + 1;
            }
            d = 1;
      }

      printf("%d\n", v);

      return 0;
}