#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int a, b, c;

      scanf("%d %d %d", &a, &b, &c);
      if ((a * c) > b)
      {
            printf("N\n");
      }
      if ((a * c) <= b)
      {
            printf("S\n");
      }

      return 0;
}