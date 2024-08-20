#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int q, i;
      int num[1000000];
      num[0] = 1;
      num[1] = 1;
      scanf("%d", &q);
      for (i = 2; i < q; i++)
      {
            num[i] = num[i - 1] + num[i - 2];
      }

      for (i = q - 1; i >= 1; i--)
      {
            printf("%d ", num[i]);
      }

      printf("1\n");
      return 0;
}