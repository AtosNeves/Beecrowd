#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int a, b, c, d;
      scanf("%d %d %d %d", &a, &b, &c, &d);

      if (a == 1)
      {
            printf("1\n");
      }

      if (b == 1)
      {
            printf("2\n");
      }

      if (c == 1)
      {
            printf("3\n");
      }

      if (d == 1)
      {
            printf("4\n");
      }

      return 0;
}