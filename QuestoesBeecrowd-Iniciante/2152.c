#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int i, q, h, m, o;
      scanf("%d", &i);
      while (i)
      {

            scanf("%d %d %d", &h, &m, &o);
            switch (o)
            {
            case 1:
                  if (h < 10 && m < 10)
                  {
                        printf("0%d:0%d - A porta abriu!\n", h, m);
                  }

                  if (h < 10 && m >= 10)
                  {
                        printf("0%d:%d - A porta abriu!\n", h, m);
                  }
                  if (h >= 10 && m < 10)
                  {
                        printf("%d:0%d - A porta abriu!\n", h, m);
                  }
                  if (h >= 10 && m >= 10)
                  {
                        printf("%d:%d - A porta abriu!\n", h, m);
                  }
                  break;

            case 0:
                  if (h < 10 && m < 10)
                  {
                        printf("0%d:0%d - A porta fechou!\n", h, m);
                  }

                  if (h < 10 && m >= 10)
                  {
                        printf("0%d:%d - A porta fechou!\n", h, m);
                  }
                  if (h >= 10 && m < 10)
                  {
                        printf("%d:0%d - A porta fechou!\n", h, m);
                  }
                  if (h >= 10 && m >= 10)
                  {
                        printf("%d:%d - A porta fechou!\n", h, m);
                  }

                  break;

            default:

                  break;
            }

            i = i - 1;
      }

      return 0;
}