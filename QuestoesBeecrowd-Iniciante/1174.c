#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      float vetor[100];
      float entrada;
      int i, j;
      for (i = 0; i < 100; i++)
      {
            scanf("%f", &vetor[i]);
      }
      for (j = 0; j < 100; j++)
      {

            if (vetor[j] <= 10)
            {
                  printf("A[%d] = %.1f\n", j, vetor[j]);
            }
      }
      return 0;
}
