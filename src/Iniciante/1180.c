#include <stdio.h>
#include <stdlib.h>

int main()
{

      int tam, i, menor, p;

      scanf("%d", &tam);
      int vetor[tam];

      scanf("%d", &vetor[0]);
      p = 0;
      menor = vetor[0];
      for (i = 1; i < tam; i++)
      {
            scanf("%d", &vetor[i]);
            if (vetor[i] < menor)
            {
                  menor = vetor[i];
                  p = i;
            }
      }

      printf("Menor valor: %d\n", menor);
      printf("Posicao: %d\n", p);

      return 0;
}