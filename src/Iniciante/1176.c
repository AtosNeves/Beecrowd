#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int a, b = 1, c = 0;
      int i, j;
      unsigned long long int vetor[65] = {0};
      vetor[0] = 0;
      vetor[1] = 1;
      scanf("%d", &a);

      for (i = 2; i < 62; i++)
      {
            vetor[i] = vetor[i - 1] + vetor[i - 2];
      }
      while (b <= a)
      {
            scanf("%d", &c);

            for (j = 0; j <= 60; j++)
            {

                  if (c == j)
                  {
                        printf("Fib(%d) = %llu\n", j, vetor[j]);
                  }
            }
            b = b + 1;
      }
      return 0;
}
