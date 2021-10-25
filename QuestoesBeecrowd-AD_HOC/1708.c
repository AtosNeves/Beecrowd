#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      float a, b;
      scanf("%f %f", &b, &a);
      float c = a - b;
      c = a / c;
      c = ceil(c);
      printf("%.f\n", c);
      return 0;
}