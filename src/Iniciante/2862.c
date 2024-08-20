#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int i, quantidade, entrada;
      scanf("%d", &quantidade);
      for (i = 0; i < quantidade; i++)
      {
            scanf("%d", &entrada);
            if (entrada > 8000)
            {
                  printf("Mais de 8000!\n");
            }
            else
            {
                  printf("Inseto!\n");
            }
      }

      return 0;
}