#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int a;

      scanf("%d", &a);
      while (a > 0)
      {
            scanf("%*s");
            printf("Y\n");
            a = a - 1;
      }

      return 0;
}