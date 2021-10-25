#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      double a;

      scanf("%lf", &a);
      printf("%+.4E\n", a);
      a = 0;

      return 0;
}