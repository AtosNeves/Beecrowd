#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int i, q, a, b;
      scanf("%d", &q);
      for (i = 0; i < q; i++)
      {
            scanf("%d %d", &a, &b);
            printf("%d cm2\n", (a * b) / 2);
      }

      return 0;
}