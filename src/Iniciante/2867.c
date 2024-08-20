#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");

      int testes;
      scanf("%d", &testes);
      int a, b;
      char numeros[900000];
      long double c;
      while (testes)
      {

            scanf("%d %d", &a, &b);
            c = floor(1 + b * log10(a));
            sprintf(numeros, "%Lf", c);
            long double d = strlen(numeros);
            printf("%.0Lf\n", c);
            testes = testes - 1;
      }
      return 0;
}