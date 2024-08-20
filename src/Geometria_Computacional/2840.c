#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>
#define pi 3.1415

float veri(int a, int b)
{
      int contador = 0;
      long double res = floor(4 * pi * pow(a, 3) / 3);
      while (res < b)
      {
            b = b - res;
            contador = contador + 1;
      }
      return contador;
}
int main()
{
      setlocale(LC_ALL, "");
      int r, v, c = 0;

      long double resultado;
      scanf("%d %d", &r, &v);
      resultado = veri(r, v);
      printf("%.0Lf\n", resultado);

      return 0;
}