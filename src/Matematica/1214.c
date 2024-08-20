#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int i, q, qq = 0, n[1000], soma = 0, total = 0, testes;
      float media = 0;
      double resultado = 0;
      scanf("%d", &testes);

      while (testes)
      {

            scanf("%d", &q);
            for (i = 0; i < q; i++)
            {
                  scanf("%d", &n[i]);
                  soma = soma + n[i];
                  qq = q;
            }

            media = soma / qq;

            //printf("%f\n", media);
            for (i = 0; i < q; i++)
            {
                  if (n[i] > media)
                  {
                        total = total + 1;
                  }
            }

            resultado = (total * 100);
            resultado = resultado / qq;
            printf("%.3lf%%\n", resultado);

            resultado = 0;
            total = 0;
            media = 0;
            soma = 0;
            testes = testes - 1;
            n[0] = '\0';
      }
      return 0;
}