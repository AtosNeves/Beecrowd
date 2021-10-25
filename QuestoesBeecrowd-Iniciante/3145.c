#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt,br");
      float x, n;
      scanf("%f %f", &n, &x);
      float c;
      n = n + 2;
      c = x / n;
      printf("%.2lf\n", c);

      return 0;
}