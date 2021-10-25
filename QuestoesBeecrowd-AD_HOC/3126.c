#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int q, e, i, somador = 0;
      scanf("%d", &q);
      for (i = 0; i < q; i++)
      {
            scanf("%d", &e);
            switch (e)
            {
            case 1:
                  somador = somador + 1;
                  break;

            default:
                  break;
            }
      }
      printf("%d\n", somador);
      return 0;
}