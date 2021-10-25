#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int h, d, g, i;
      scanf("%d", &i);
      while (i)
      {

            scanf("%d %d %d", &h, &d, &g);

            if (h >= 200 && h <= 300 && d >= 50 && g >= 150)
            {
                  printf("Sim\n");
            }
            else
            {
                  printf("Nao\n");
            }
            i--;
      }

      return 0;
}