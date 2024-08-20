#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int m, f1, f2, f3, maior;
      scanf("%d", &m);
      scanf("%d", &f1);
      scanf("%d", &f2);
      maior = f1;
      f3 = m - f1 - f2;

      if (maior <= f2)
      {
            maior = f2;
      }
      if (maior < f3)
      {
            maior = f3;
      }

      printf("%d\n", maior);

      return 0;
}