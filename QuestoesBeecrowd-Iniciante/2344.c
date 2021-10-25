#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int a;
      scanf("%d", &a);
      if (a == 0)
      {
            printf("E\n");
      }
      if (1 <= a && a <= 35)
      {
            printf("D\n");
      }
      if (36 <= a && a <= 60)
      {
            printf("C\n");
      }
      if (61 <= a && a <= 85)
      {
            printf("B\n");
      }
      if (86 <= a && a <= 100)
      {
            printf("A\n");
      }

      return 0;
}