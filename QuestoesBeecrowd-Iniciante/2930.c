#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int e, d, r;
      scanf("%d %d", &e, &d);

      r = d - e;

      if (r >= 0 && r < 3 && e <= 21)
      {
            printf("Parece o trabalho do meu filho!\nTCC Apresentado!\n");
      }
      if (r < 3 && e <= 24 && e > 21)
      {
            printf("Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!\n");
      }

      if (r >= 3)
      {
            printf("Muito bem! Apresenta antes do Natal!\n");
      }
      if (r < 0)
      {
            printf("Eu odeio a professora!\n");
      }

      return 0;
}