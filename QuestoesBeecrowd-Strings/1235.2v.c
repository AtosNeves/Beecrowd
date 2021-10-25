#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char a[128];
      int i, j,t;
      int q;
      scanf("%d", &q);

      for (j = 0; j <= q; j++)
      {

            fgets(a, 102, stdin);
             t = strlen(a)-1;
            // printf("%d", t);
            for (i = (t / 2) - 1; i > -1; i--)
            {
                  printf("%c", a[i]);
            }
            for (i = t - 1; i >= t / 2; i--)
            {
                  if (a[(t / 2) + 2] == "\0")
                  {
                        a[(t / 2) + 2] == "0";
                  }

                  printf("%c", a[i]);

                  if (i == (t / 2))
                  {
                        printf("\n");
                  }
            }
      }
      //printf("%d", t);
      return 0;
}