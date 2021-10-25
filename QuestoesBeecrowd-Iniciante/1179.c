#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int entrada, i, j, par[5] = {0}, impar[5] = {0}, p = 0, pp = 0, l, m, n;

      for (i = 0; i < 15; i++)
      {
            scanf("%d", &entrada);

            if (entrada % 2 == 0)
            {
                  par[p] = entrada;
                  p++;

                  if (p == 5)
                  {

                        for (l = 0; l < 5; l++)
                        {
                              printf("par[%d] = %d\n", l, par[l]);
                              par[l] = 0;
                              p = 0;
                        }
                  }
            }

            if (entrada % 2 != 0)
            {
                  impar[pp] = entrada;
                  pp++;
                  if (pp == 5)
                  {

                        for (j = 0; j < 5; j++)
                        {
                              printf("impar[%d] = %d\n", j, impar[j]);
                              impar[j] = 0;

                              pp = 0;
                        }
                  }
            }
      }

      for (m = 0; m < 5; m++)
      {

            if (impar[m] == 0)
                  break;

            printf("impar[%d] = %d\n", m, impar[m]);
      }
      for (n = 0; n < 5; n++)
      {

            if (par[n] == 0)
                  break;

            printf("par[%d] = %d\n", n, par[n]);
      }

      return 0;
}