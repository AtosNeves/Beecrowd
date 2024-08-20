#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int entrada = 0, testes = 0, contador = 0;
      int r1, r2;
      scanf("%d", &testes);
      while (contador < testes)
      {
            scanf("%d %d", &r1, &r2);

            printf("%d\n", r1 + r2);

            contador = contador + 1;
      }

      return 0;
}