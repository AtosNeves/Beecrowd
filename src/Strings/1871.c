#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char saida[900000];
      int a, b;
      while (scanf("%d %d", &a, &b) && (a + b) != 0)
      {

            int c = a + b, i;
            sprintf(saida, "%d", c);
            int len = strlen(saida);
            for (i = 0; i < len; i++)
            {
                  if (saida[i] != '0')
                  {
                        printf("%c", saida[i]);
                  }
            }
            saida[0] = '\n';
            printf("\n");
      }
      return 0;
}
