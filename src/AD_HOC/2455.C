#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int p1, c1, p2, c2;
      scanf("%d %d %d %d", &p1, &c1, &p2, &c2);
      int r1, r2;
      r1 = c1 * p1;
      r2 = c2 * p2;
      if (r1 > r2)
      {
            printf("-1\n");
      }
      if (r2 > r1)
      {
            printf("1\n");
      }
      if (r1 == r2)
      {
            printf("0\n");
      }

      return 0;
}