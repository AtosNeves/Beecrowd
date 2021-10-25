#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char e[51], f[51];
      //char f;
      int t, i, q = -1, v;
      while (fgets(e, 51, stdin) != NULL)
      {
            q = -1;
            t = strlen(e) - 1;
            for (i = 0; i < t; i++)
            {
                  q = q + 1;
                  if (e[i] != ' ')
                  {

                        v = q % 2;
                  }
                  if (v == 0 && e[i] != ' ')
                  {

                        printf("%c", toupper(e[i]));
                  }
                  if (v == 1 && e[i] != ' ')
                  {

                        printf("%c", tolower(e[i]));
                  }
                  if (e[i] == ' ')
                  {
                        printf(" ");
                        q = q - 1;
                  }
            }
            printf("\n");
      }
      return 0;
}