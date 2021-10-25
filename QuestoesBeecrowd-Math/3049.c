#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int a, b, t;
      scanf("%d", &b);
      scanf("%d", &t);

      a = ((b + t) * 70) / 2;

      if (a < 5600)
      {
            printf("2\n");
      }
      if (a > 5600)
      {
            printf("1\n");
      }
      if (a == 5600)
      {
            printf("0\n");
      }

      return 0;
}