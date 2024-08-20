#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      long int c1, c2;
      float p1, p2;
      int cresce1 = 0, cresce2 = 0, c = 0, n, i;

      scanf("%d", &n);
      for (i = 0; i < n; i++)
      {

            scanf("%li %li %f %f", &c1, &c2, &p1, &p2);

            while (c1 <= c2)
            {

                  cresce1 = (p1 / 100) * c1;
                  cresce2 = (p2 / 100) * c2;

                  c1 = c1 + cresce1;
                  c2 = c2 + cresce2;
                  c = c + 1;
            }

            if (c > 100)
            {
                  printf("Mais de 1 seculo.\n");
            }

            else
                  printf("%d anos.\n", c);
            c = 0;
      }

      return 0;
}