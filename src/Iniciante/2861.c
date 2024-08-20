#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int q;
      scanf("%d", &q);
      while (q)
      {
            scanf("%*s");
            printf("gzuz\n");
            q = q - 1;
      }

      return 0;
}