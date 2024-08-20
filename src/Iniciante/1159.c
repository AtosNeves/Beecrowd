#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int x = 0;
      int a, b;
      int soma = 0;

      while (x == 0)
      {
            scanf("%d", &a);

            if (a == 0)
            {
                  x = 1;
            }

            else
            {

                  if (a % 2 == 1 || a % 2 == -1)
                  {
                        a = a + 1;
                  }

                  for (b = 0; b < 5; b++)
                  {
                        soma = soma + a;
                        a = a + 2;
                  }
                  printf("%d\n", soma);
                  soma = 0;
                  a = 0;
            }
      }
      return 0;
}
