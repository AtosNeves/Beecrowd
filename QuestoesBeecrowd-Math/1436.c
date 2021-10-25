#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int tam, testes, contador = 0;
      scanf("%d", &testes);
      while (testes >= 1)
      {
            contador = contador + 1;

            scanf("%d", &tam);
            int l, n;
            int i;
            for (i = 0; i < tam; i++)
            {

                  if (i == ((tam - 1) / 2))
                  {
                        scanf("%d", &l);
                  }
                  else
                  {
                        scanf("%d", &n);
                  }
            }
            //int m = (tam - 1) / 2;
            printf("Case %d: %d\n", contador, l);
            l = 0;
            //v[0] = '\n';
            testes = testes - 1;
      }
      return 0;
}