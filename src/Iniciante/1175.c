#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int vetor[20], i, j, entrada;
      int u = 0;
      for (i = 0; i < 20; i++)
      {
            scanf("%d", &entrada);
            vetor[i] = entrada;
      }

      for (j = 19; j >= 0; j--)
      {

            printf("N[%d] = %d\n", u, vetor[j]);
            u = u + 1;
      }

      return 0;
}