#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int p, n = 0, a, i, j;
      int d = 0;
      char w[20] = "YOU WIN";
      char l[20] = "GAME OVER";
      char r[20];
      scanf("%d %d", &p, &n);
      int pulo[n];
      for (i = 0; i < n; i++)
      {
            scanf("%d", &pulo[i]);
      }
      i = 0;
      for (i = 1; i < n; i++)
      {
            if ((pulo[i] - pulo[i - 1]) > p)
            {
                  d = 1;
            }

            if ((pulo[i - 1] - pulo[i]) > p)
            {
                  d = 1;
            }
      }

      if (d == 0)
      {
            printf("%s\n", w);
      }
      if (d != 0)
      {
            printf("%s\n", l);
      }

      return 0;
}