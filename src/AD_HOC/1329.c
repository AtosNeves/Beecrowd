#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int i, q, e, f = 1, m = 0, j = 0;
      while (f == 1)
      {

            scanf("%d", &q);
            switch (q)
            {
            case 0:
                  return 0;
                  

            default:
                  for (i = 0; i < q; i++)
                  {
                        scanf("%d", &e);
                        switch (e)
                        {
                        case 0:
                              m = m + 1;
                              break;
                        case 1:
                              j = j + 1;
                              break;
                        default:
                              break;
                        
                        }
                  }
                  printf("Mary won %d times and John won %d times\n", m, j);
                  m = 0, j = 0;
                  break;
            }
      }

      return 0;
}
