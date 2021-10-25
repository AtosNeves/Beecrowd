#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      double i;
      double s = 0;
      for (i = 1; i <= 100; i++)
      {
            s = s + (1 / i);
      }

      printf("%.2lf\n", s);

      return 0;
}