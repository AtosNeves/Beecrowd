#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      long int a, b;
      scanf("%ld %ld", &a, &b);
      while (a >= b)
      {
            a = a - b;
      }

      printf("%ld\n", a);

      return 0;
}