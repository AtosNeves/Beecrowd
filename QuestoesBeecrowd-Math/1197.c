#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int v, t;
      while ((scanf("%d %d", &v, &t)) != EOF)
      {
            printf("%d\n", v * t * 2);
      }

      return 0;
}