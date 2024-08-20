#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int q, i, maior = 20000000, seg = -1, pm, j, aux, y;
      int entrada;
      while (scanf("%d", &q) && q != 0)

      {
            int suspeitos[q];
            int suspeitos2[q];
            for (i = 0; i < q; i++)
            {

                  scanf("%d", &entrada);
                  suspeitos[i] = entrada;
                  suspeitos2[i] = entrada;
                  if (i == 0)
                  {
                        maior = entrada;
                  }
            }

            for (i = 1; i < q; i++)
            {
                  for (j = 0; j < q - 1; j++)
                  {
                        if (suspeitos[j] > suspeitos[j + 1])
                        {
                              aux = suspeitos[j];
                              suspeitos[j] = suspeitos[j + 1];
                              suspeitos[j + 1] = aux;
                        }
                  }
            }

            maior = suspeitos[q - 2];
            for (i = 0; i < q; i++)
            {
                  if (suspeitos2[i] == maior)
                  {
                        printf("%d\n", i + 1);
                        break;
                  }
            }

            maior = -10;

            //printf("%d\n", pm);
      }
      return 0;
}