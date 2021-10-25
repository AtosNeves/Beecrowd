#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int vetor[10], i, j, n;
      scanf("%d", &n);
      vetor[0] = n;
      for (i = 1; i < 10; i++)
      {
            n = n * 2;
            vetor[i] = n;
      }

      for (j = 0; j < 10; j++)
      {
            printf("N[%d] = %d\n", j, vetor[j]);
      }
      return 0;
}