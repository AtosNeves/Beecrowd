#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int a, c = -1, i, j, d = 0, e = 1, caso = 0, numeros = 1;

      while (scanf("%d", &a) != EOF)
      {
            e = 0;
            numeros = 1;
            c = -1;
            d = 0;

            caso = caso + 1;

            for (i = 0; i < a; i++)
            {

                  for (j = 0; j <= c; j++)
                  {

                        // e = e + 1;

                        numeros = numeros + 1;
                  }
                  c = c + 1;
                  d = d + 1;
            }
            if (a != 0)
            {

                  for (i = 0; i < d; i++)
                  {
                        numeros = numeros + 1;
                  }
            }
            c = -1;
            d = 0;
            if (a == 0)
            {
                  printf("Caso %d: %d numero\n", caso, numeros);
                  printf("0\n\n");
            }
            else
            {
                  printf("Caso %d: %d numeros\n", caso, numeros);

                  printf("0 ");
                  for (i = 0; i < a; i++)
                  {

                        for (j = 0; j <= c; j++)
                        {
                              printf("%d ", d);

                              e = e + 1;

                              // numeros=numeros+1;
                        }
                        c = c + 1;
                        d = d + 1;
                  }
                  if (a != 0)
                  {

                        for (i = 0; i < d - 1; i++)
                        {
                              printf("%d ", d);
                              //numeros=numeros+1;
                        }
                        printf("%d\n", d);
                  }

                  printf("\n");
                  /*                 */
            }

            /*                 */
      }

      return 0;
}