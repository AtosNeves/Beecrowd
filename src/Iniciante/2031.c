#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char j1[15], j2[15];
      int i, a;
      scanf("%d", &a);
      for (i = 0; i < a; i++)
      {
            scanf("%s", &j1);
            scanf("%s", &j2);

            if (strcmp(j1, "ataque") == 0 && strcmp(j2, "pedra") == 0)
            {
                  printf("Jogador 1 venceu\n");
            }

            if (strcmp(j1, "pedra") == 0 && strcmp(j2, "papel") == 0)
            {
                  printf("Jogador 1 venceu\n");
            }

            if (strcmp(j1, "ataque") == 0 && strcmp(j2, "papel") == 0)
            {
                  printf("Jogador 1 venceu\n");
            }

            if (strcmp(j1, "ataque") == 0 && strcmp(j2, "ataque") == 0)
            {
                  printf("Aniquilacao mutua\n");
            }
            if (strcmp(j1, "papel") == 0 && strcmp(j2, "papel") == 0)
            {
                  printf("Ambos venceram\n");
            }
            if (strcmp(j1, "pedra") == 0 && strcmp(j2, "pedra") == 0)
            {
                  printf("Sem ganhador\n");
            }

            if (strcmp(j1, "pedra") == 0 && strcmp(j2, "ataque") == 0)
            {
                  printf("Jogador 2 venceu\n");
            }

            if (strcmp(j1, "papel") == 0 && strcmp(j2, "pedra") == 0)
            {
                  printf("Jogador 2 venceu\n");
            }

            if (strcmp(j1, "papel") == 0 && strcmp(j2, "ataque") == 0)
            {
                  printf("Jogador 2 venceu\n");
            }
      }

      return 0;
}