#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int N[1000] = {0};
      N[0] = 0;
      N[1] = 1;
      int a, i = 0, j, k, b = 0, c = 0;
      scanf("%d", &a);

      for (j = 0; j < 1000; j++)
      {
            N[j] = j % a;
      }

      for (j = 0; j < 1000; j++)
      {
            printf("N[%d] = %d\n", j, N[j]);
      }

      return 0;
}