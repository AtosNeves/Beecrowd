#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int a;

      scanf("%d", &a);

      if (a % 2 == 0)
      {
            printf("%d\n", a + 2);
      }
      if (a % 2 != 0)
      {
            printf("%d\n", a + 1);
      }

      return 0;
}