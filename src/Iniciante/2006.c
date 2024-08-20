#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int n, x, i, v = 0;
      scanf("%d", &n);
      for (i = 0; i < 5; i++)
      {
            scanf("%d", &x);
            if (x == n)
            {
                  v = v + 1;
            }
      }

      printf("%d\n", v);

      return 0;
}