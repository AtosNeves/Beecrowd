#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char n1[1001], n2[1002];

      int i, j, resultado, q, z;
      scanf("%d", &q);
      for (z = 0; z < q; z++)
      {
            scanf("%s %s", n1, n2);
            int nn1 = strlen(n1);
            int nn2 = strlen(n2);

            for (i = nn1 - 1, j = nn2 - 1; i > -1; i--, j--)
            {
                  if (n1[i] == n2[j])
                  {
                        resultado = resultado + 1;
                  }
            }
            if (resultado == nn2)
            {
                  printf("encaixa\n");
            }
            if (resultado != nn2)
            {

                  printf("nao encaixa\n");
            }
            n1[0] = "\0", n2[0] = "\0";
            resultado = 0;
      }
      return 0;
}