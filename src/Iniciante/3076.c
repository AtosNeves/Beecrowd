#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      unsigned long long int a, b;
      while (scanf("%llu", &a) != EOF)
      {
            b = a % 100;
            if (b == 0)
            {
                  printf("%llu\n", (a / 100));
            }

            else
            {
                  printf("%llu\n", (a / 100) + 1);
            }
      }
      return 0;
}