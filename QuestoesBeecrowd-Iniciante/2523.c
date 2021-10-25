#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      char a[27];
      int q, i, k, j = 1;
      while (scanf("%s", a) != EOF)
      {

            scanf("%d", &q);
            for (i = 0; i < q; i++)
            {
                  scanf("%d", &k);

                  printf("%c", a[k - 1]);
            }

            printf("\n");
      }

      return 0;
}