#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int i, j;
      for (i = 1; i <= 39; i++)
      {
            printf("-");
      }
      printf("\n");

      for (j = 0; j < 5; j++)
      {
            printf("|");
            for (i = 2; i <= 38; i++)
            {
                  printf(" ");
            }
            printf("|\n");
      }
      for (i = 1; i <= 39; i++)
      {
            printf("-");
      }
      printf("\n");

      return 0;
}