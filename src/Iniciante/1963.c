#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      double a, b, c = 0;
      scanf("%lf %lf", &a, &b);

      c = b / a;

      c = c * 100 - 100;

      printf("%.2lf%%\n", c);

      return 0;
}