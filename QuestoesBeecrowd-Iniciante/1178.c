#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      double vetor[100] = {0}, aux;
      double b;
      int i, j;
      scanf("%lf", &b);

      for (i = 0; i < 100; i++)
      {
            vetor[i] = b;
            b = b / 2;
      }
      for (j = 0; j < 100; j++)
      {
            printf("N[%d] = %.4lf\n", j, vetor[j]);
      }

      return 0;
}