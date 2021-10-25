#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>

int main()
{
      bool verifica = true;

      setlocale(LC_ALL, "");
      long int nn1, nn2;

      int testes;

      scanf("%d", &testes);
      while (testes)
      {
            char n1[900000], n2[900000];
            verifica = true;
            scanf("%s", &n1);
            scanf("%s", &n2);

            int contador = 0;
            long int len1 = strlen(n1);
            long int len2 = strlen(n2);
            long int c = len1 - len2;
            int i;

            if (len2 > len1)
            {
                  printf("nao encaixa\n");
            }

            else
            {

                  for (i = c; i <= len1; i++)
                  {
                        if (n1[i] != n2[contador])
                        {
                              verifica = false;
                        }
                        contador = contador + 1;
                  }
                  switch (verifica)
                  {
                  case true:
                        printf("encaixa\n");
                        break;

                  default:
                        printf("nao encaixa\n");
                        break;
                  }
            }
            testes = testes - 1;

            contador = 0;
            n1[0] = '\n';
            n2[0] = '\n';
      }
      return 0;
}