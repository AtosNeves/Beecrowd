#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int a, i, c = 1;
      double r, soma = 0;

      scanf("%d", &a);

      for (i = 0; i < a; i++)
      {
            soma = soma + 2;
            soma = 1 / soma;
      }
      soma = soma + 1;
      printf("%.10lf\n", soma);
      return 0;
}