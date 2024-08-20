#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int o = 0;
      float up = 1, dp = 1;
      int i;
      double soma = 0;
      for (i = 0; i < 19; i++)
      {

            up = up + 2;
            dp = dp * 2;

            soma = soma + (up / dp);
      }
      soma = soma + 1;
      printf("%.2lf\n", soma);

      return 0;
}
