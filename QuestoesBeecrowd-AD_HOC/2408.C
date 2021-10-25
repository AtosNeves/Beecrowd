#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      system("clear");
      setlocale(LC_ALL, "");
      int v[3];
      int i, j;
      int aux;

      for (i = 0; i < 3; i++)
      {
            scanf("%d", &v[i]);
      }
      for (i = 1; i < 3; i++)
      {
            for (j = 0; j < 2; j++)
            {
                  if (v[j] > v[j + 1])
                  {
                        aux = v[j];
                        v[j] = v[j + 1];
                        v[j + 1] = aux;
                  }
            }
      }
      printf("%d\n", v[1]);

      return 0;
}