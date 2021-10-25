#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char aa[27], b[1002];

      int a, i, c, d;
      while ((fgets(aa, 26, stdin)))
      {
            scanf("%s", aa);
            d = strlen(aa) - 1;

            scanf("%d", &a);
            for (i = 0; i < a; i++)
            {
                  scanf("%d", &c);
                  if (c == 1)
                  {
                        b[i] = 'A';
                  }
                  else
                  {
                        b[i] = aa[c - 1];
                  }
            }
            for (i = 0; i < a; i++)
            {
                  printf("%c", b[i]);
            }
            printf("\n");
            int j = strlen(aa), k = strlen(b);
           /* for (i = 0; i < j; i++)
            {
                  aa[i] = "";
            }
            for (i = 0; i < k; i++)
            {
                  b[i] = "";
            }*/
            aa[0]='\0';
            b[0]='\0';
      }

      return 0;
}