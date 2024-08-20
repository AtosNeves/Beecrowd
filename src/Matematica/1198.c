#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      long long int a, b;

      while (scanf("%lld %lld", &a, &b) != EOF)
      {
            if (a >= b)
            {
                  printf("%llu\n", a - b);
            }
            else
            {
                  printf("%lld\n", b - a);
            }
      }

      return 0;
}