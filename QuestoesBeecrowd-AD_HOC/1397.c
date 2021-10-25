#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int q, i;
      int a, b;
      int sa = 0, sb = 0;
      while (scanf("%d", &q) != 0)
      {
            if (q == 0)
            {
                  return 0;
            }

            for (i = 0; i < q; i++)
            {

                  scanf("%d %d", &a, &b);
                  if (a > b)
                  {
                        sa = sa + 1;
                  }
                  if (a < b)
                  {
                        sb = sb + 1;
                  }
            }
            printf("%d %d\n", sa, sb);
            sa = 0, sb = 0;
      }
      return 0;
}