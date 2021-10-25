#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int q;
      unsigned long long int i, j1, j2, res;
      char nome1[100], nome2[100], es1[6], es2[6], resultado[6];

      scanf("%d", &q);
      for (i = 0; i < q; i++)
      {

            scanf("%s %s %s %s", &nome1, &es1, &nome2, &es2);
            scanf("%llu %llu", &j1, &j2);

            res = (j1 + j2) % 2;

            switch (res)
            {
            case 0:
                  strcpy(resultado, "PAR");
                  break;

            case 1:
                  strcpy(resultado, "IMPAR");

                  break;
            default:
                  break;
            }

            if ((strcmp(resultado, es1) == 0))
            {
                  printf("%s\n", nome1);
            }
            if ((strcmp(resultado, es2) == 0))
            {

                  printf("%s\n", nome2);
            }
      }

      return 0;
}