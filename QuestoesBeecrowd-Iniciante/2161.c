#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int entrada, i;
      double resultado = 0;
      scanf("%d", &entrada);
      for (i = 0; i < entrada; i++)
      {
            resultado = resultado + 6;
            resultado = 1 / resultado;
      }
      resultado = resultado + 3;
      printf("%.10lf\n", resultado);
      return 0;
}