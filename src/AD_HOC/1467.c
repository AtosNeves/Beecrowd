#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char entrada[10];
      int a, b, c;
      fflush(stdin);
      while (scanf("%d %d %d", &a, &b, &c) != EOF)

      {
            /* code */

            if (a != b && a != c)
            {
                  printf("A\n");
            }
            else if (b != a && b != c)
            {
                  printf("B\n");
            }
            else if (c != b && c != a)
            {
                  printf("C\n");
            }
            else
            {
                  printf("*\n");
            }
      }
      return 0;
}