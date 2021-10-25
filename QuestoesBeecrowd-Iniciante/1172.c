#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int vetor[10], i, n, j;
      for (i = 0; i < 10; i++)
      {
            scanf("%d", &n);

            if (n <= 0)
            {
                  n = 1;
            }
            vetor[i] = n;
      }

      for (j = 0; j < 10; j++)
      {
            printf("X[%d] = %d\n", j, vetor[j]);
      }

      return 0;
}