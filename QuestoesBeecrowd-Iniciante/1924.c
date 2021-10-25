#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int n, a = 0;

      scanf("%d", &n);
      while (a < n)
      {
            scanf("%*s");

            a = a + 1;
      }

      printf("Ciencia da Computacao\n");

      return 0;
}