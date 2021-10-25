#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int n, m, i;
      char acao[15];
      scanf("%d %d", &n, &m);

      for (i = 0; i < m; i++)
      {
            scanf("%s", &acao);

            if (strcmp(acao, "fechou") == 0)
            {
                  n = n + 1;
            }
            if (strcmp(acao, "clicou") == 0)
            {
                  n = n - 1;
            }
      }

      printf("%d\n", n);

      return 0;
}