#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char *sub;
      char entrada[1000];
      int i, testes;
      scanf("%d", &testes);
      for (i = 0; i < testes; i++)
      {
            /* code */

            scanf("%s", &entrada);
            if (entrada[1] == '=')
            {
                  printf("skipped\n");
            }

            else
            {
                  sub = strtok(entrada, "+");
                  int g = atoi(sub);
                  int soma = soma + g;
                  sub = strtok(NULL, "+");
                  g = atoi(sub);
                  soma = soma + g;
                  printf("%d\n", soma);
                  soma = 0;
            }
      }

      return 0;
}