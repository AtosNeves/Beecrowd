#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int testes;
      scanf("%d", &testes);
      char entrada[5];
      while (testes)
      {

            scanf("%s", entrada);
            int saida = retorno(entrada);
            printf("%d\n", saida);
            entrada[0] = '\n';
            testes = testes - 1;
      }
      return 0;
}

int retorno(char entra[5])
{
      int a;

      if ((entra[0] == 'o' && entra[2] == 'e') ||
          (entra[1] == 'o' && entra[2] == 'e') ||
          (entra[0] == 'o' && entra[1] == 'n'))
      {
            a = 1;
      }
      if ((entra[0] == 't' && entra[2] == 'o') ||
          (entra[1] == 'w' && entra[2] == 'o') ||
          (entra[0] == 't' && entra[1] == 'w'))
      {
            a = 2;
      }
      else if (strlen(entra) >= 4)
            a = 3;

      return a;
}