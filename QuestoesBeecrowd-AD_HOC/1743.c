#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>

int main()
{
      setlocale(LC_ALL, "");
      bool verifica = true;
      int a1[6], a2[6];
      int v[6], i;
      for (i = 0; i < 5; i++)
      {
            scanf("%d", &a1[i]);
      }
      for (i = 0; i < 5; i++)
      {
            scanf("%d", &a2[i]);
      }
      for (i = 0; i < 5; i++)
      {
            if (a1[i] != a2[i])
            {
                  v[i] = 1;
            }

            else
            {
                  v[i] = 0;
            }
      }
      for (i = 0; i < 5; i++)
      {
            if (v[i] == 0)
            {
                  verifica = false;
            }
      }

      switch (verifica)
      {
      case true:
            printf("Y\n");
            break;
      case false:
            printf("N\n");
            break;

      default:
            break;
      }

      return 0;
}