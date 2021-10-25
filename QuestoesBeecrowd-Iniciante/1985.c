#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#define p1001 1.5
#define p1002 2.5
#define p1003 3.5
#define p1004 4.5
#define p1005 5.5

int main()
{
      setlocale(LC_ALL, "pt-br");
      int q, i, escolha, quantidade;
      float soma;
      scanf("%d", &q);
      for (i = 0; i < q; i++)
      {
            scanf("%d %d", &escolha, &quantidade);

            switch (escolha)
            {
            case 1001:
                  soma = soma + p1001 * quantidade;
                  break;
            case 1002:
                  soma = soma + p1002 * quantidade;
                  break;
            case 1003:
                  soma = soma + p1003 * quantidade;
                  break;
            case 1004:
                  soma = soma + p1004 * quantidade;
                  break;
            case 1005:
                  soma = soma + p1005 * quantidade;
            default:
                  break;
            }
      }
      printf("%.2f\n", soma);
      return 0;
}