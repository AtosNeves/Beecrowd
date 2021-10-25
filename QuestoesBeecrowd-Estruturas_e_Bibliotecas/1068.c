#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>
int veri(char c[900000])
{
      bool tick = false;
      bool t = true;
      int u = 0;
      bool verifica = false;
      int i;
      int len = strlen(c);
      for (i = 0; i < len; i++)
      {
            if (c[i] == '(')
            {
                  u = u + 1;
            }
            if (c[i] == ')')
            {
                  u = u - 1;
            }
            if (u < 0)
            {
                  return 1;
            }
      }
      if (u == 0)
      {
            return 0;
      }
      if (u != 0)
      {
            return 1;
      }
}
int main()
{
      setlocale(LC_ALL, "");
      bool verifica = false;
      int h = 0;
      char entrada[900000];

      while (scanf("%s", &entrada) != EOF)
      {
            int i, len = strlen(entrada);
            int r = veri(entrada);
            switch (r)
            {
            case 1:
                  printf("incorrect\n");
                  break;
            case 0:
                  printf("correct\n");
                  break;
            default:
                  break;
            }
      }
      return 0;
}