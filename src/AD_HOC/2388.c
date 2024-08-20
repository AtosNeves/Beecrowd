#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int q, i, vm, dt, soma=0;
      scanf("%d",&q);
      for (i = 0; i < q; i++)
      {
            scanf("%d %d", &dt, &vm);
            soma = soma + dt * vm;
      }
      printf("%d\n", soma);

      return 0;
}