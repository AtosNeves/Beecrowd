#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");

      int m, i, j, q, h = 0;
      scanf("%d", &q);
      for (j = 0; j < q; j++)
      {
            char a[50] = {"\0"}, b[50] = {"\0"};

            scanf("%s %s", a, b);

            int m = strlen(a);
            int n = strlen(b);
            int d;

            if (m >= n)
            {
                  d = m;
            }
            if (n > m)
            {
                  d = n;
            }

            for (i = 0; i < d; i++)
            {

                  if (h < m)
                  {
                        printf("%c", a[i]);
                  }
                  if (h < n)
                  {
                        printf("%c", b[i]);
                  }

                  h = h + 1;
            }

            printf("\n");
            h = 0;
      }

      return 0;
}