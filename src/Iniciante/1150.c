#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int a, b, c = 0, soma = 0, q = 0;

      scanf("%d", &a);
      while (c == 0)
      {

            scanf("%d", &b);

            if (b > a)
            {
                  c = 2;
            }
      }

      while (soma < b)
      {

            soma = soma + a;
            a = a + 1;
            q = q + 1;
      }

      printf("%d\n", q);

      return 0;
}