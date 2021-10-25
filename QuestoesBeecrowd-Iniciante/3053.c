#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int q, i, e, aux, giro, j;

      int a, b, c;
      char certo[2];
      int ca = 0, cb = 0, cc = 0;
      scanf("%d", &q);

      scanf("%s", &certo);
      if (certo[0] == 'A')
      {
            ca = 1;
      }
      else if (certo[0] == 'B')
      {
            cb = 1;
      }
      else if (certo[0] == 'C')
      {
            cc = 1;
      }

      for (i = 1; i <= q; i++)
      {

            scanf(" %d", &e);

            switch (e)
            {
            case 1:
                  aux = ca;
                  ca = cb;
                  cb = aux;
                  aux = 0;
                  break;

            case 2:
                  aux = cb;
                  cb = cc;
                  cc = aux;
                  aux = 0;
                  break;
            case 3:
                  aux = ca;
                  ca = cc;
                  cc = aux;
                  break;

            case 0:
                  printf("asdasdadad\n");
                  break;

            default:
                  break;
            }
      }

      if (ca == 1)
      {
            printf("A\n");
      }
      if (cb == 1)
      {
            printf("B\n");
      }
      if (cc == 1)
      {
            printf("C\n");
      }

      return 0;
}