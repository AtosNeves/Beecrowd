#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int t, i, m;
      scanf("%d", &t);
      int p[t];

      for (i = 1; i <= t; i++)
      {
            scanf("%d", &p[i]);
      }
      m = p[1];
      for (i = 1; i <= t; i++)
      {
            if (m > p[i])
            {
                  m = i;
                  break;
            }
            else
            {
                  m = 1;
            }
      }

      printf("%d\n", m);

      return 0;
}