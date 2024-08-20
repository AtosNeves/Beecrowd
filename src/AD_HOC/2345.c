#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int jogadores[5], i, j, aux;
      for (i = 0; i < 4; i++)
      {
            scanf("%d", &jogadores[i]);
      }
      for (i = 1; i < 4; i++)
      {
            for (j = 0; i < 3; i++)
            {
                  if (jogadores[j] > jogadores[j + 1])
                  {
                        aux = jogadores[j];
                        jogadores[j] = jogadores[j + 1];
                        jogadores[j + 1] = aux;
                  }
            }
            printf("%d\n", abs((jogadores[0] + jogadores[3]) - (jogadores[1] + jogadores[2])));
      }

      return 0;
}