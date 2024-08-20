#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char a[10000];

      int i, c, b = 1, p = -1, pi, f = -1, fi, m;
      while (fgets(a, 51, stdin))
      {

            m = strlen(a);

            /* code */

            for (i = 0; i < m; i++)
            {

                  if (a[i] != '_' && a[i] != '*')
                  {
                        printf("%c", a[i]);
                        a[i] = '\0';
                  }

                  if (a[i] == '*')
                  {
                        p = p + 1;
                        pi = p % 2;
                        switch (pi)

                        {
                        case 0:
                              printf("<b>");
                              a[i] = '\0';
                              break;

                        default:
                              printf("</b>");
                              a[i] = '\0';
                              break;
                        }
                  }
                  if (a[i] == '_')
                  {
                        f = f + 1;
                        fi = f % 2;
                        switch (fi)

                        {
                        case 0:
                              printf("<i>");
                              a[i] = '\0';
                              break;

                        default:
                              printf("</i>");
                              a[i] = '\0';
                              break;
                        }
                  }
            }
            //printf("\n");
            a[0] = '\0';
      }

      return 0;
}