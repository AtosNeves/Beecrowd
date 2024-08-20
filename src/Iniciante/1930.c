#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int a, b, c, d;
      scanf("%d %d %d %d", &a, &b, &c, &d);
      printf("%d\n", (a + b + c + d) - 3);

      return 0;
}