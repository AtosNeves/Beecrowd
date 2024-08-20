#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int valor, soma = 0, n, i;
      while (scanf("%d", &n))
      {
            if (n == 0)
            {
                  break;
            }
            else
            {
                  for (i = 1; i <= n; i++)
                  {
                        valor = i * i;
                        soma = soma + valor;
                  }
                  printf("%d\n", soma);
                  soma = 0;
            }
      }
      return 0;
}