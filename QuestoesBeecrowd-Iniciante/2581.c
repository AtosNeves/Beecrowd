#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int n, i;
      scanf("%d", &n);
      for (i = 0; i < n; i++)
      {
            scanf("%*s");
            printf("I am Toorg!\n");
      }

      return 0;
}