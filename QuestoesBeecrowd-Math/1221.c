#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{

      setlocale(LC_ALL, "");
      long long int e, a;
      int i, q, v = 0, j;
      scanf("%d", &q);

      for (i = 0; i < q; i++)
      {
            scanf("%lld", &e);
            v = 0;

            switch (e)
            {
            case 0:
                  printf("Not Prime\n");
                  continue;

            case 1:
                  printf("Not Prime\n");
                  continue;
            case 2:
                  printf("Prime\n");
                  continue;
            default:
                  for (j = 2; j < sqrt(e) + 1; j++)
                  {
                        if (e % j == 0)
                        {
                              v = v + 1;
                        }
                  }

                  switch (v)
                  {
                  case 0:
                        printf("Prime\n");

                        break;

                  default:
                        printf("Not Prime\n");

                        break;
                  }
                  break;
            }

            v = 0;
      }

      return 0;
}