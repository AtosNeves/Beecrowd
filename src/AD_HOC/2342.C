#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int r, resultado;
      int a, b;
      char o[2];
      scanf("%d", &r);
      scanf("%d %c %d", &a, &o, &b);
      if (o[0] == '*')
      {
            resultado = a * b;
            if (resultado <= r)
            {
                  printf("OK\n");
            }
            else
            {
                  printf("OVERFLOW\n");
            }
      }
      if (o[0] == '+')
      {
            resultado = a + b;
            if (resultado <= r)
            {
                  printf("OK\n");
            }
            else
            {
                  printf("OVERFLOW\n");
            }
      }

      return 0;
}