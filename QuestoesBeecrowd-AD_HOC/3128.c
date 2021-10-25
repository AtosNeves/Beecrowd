#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int a, b;
      scanf("%d", &a);
      scanf("%d", &b);
      if (a < 6 || b < 6)
      {
            printf("NO\n");
      }
      else if ((a >= 18 && b >= 6) || ((b >= 18 && a >= 6)))
      {
            printf("YES\n");
      }
      else if ((a >= 14 && b >= 14))
      {
            printf("YES\n");
      }
      else
      {
            printf("NO\n");
      }

      return 0;
}