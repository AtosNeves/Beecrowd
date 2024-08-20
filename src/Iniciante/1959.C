#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      unsigned long long int a, b;
      scanf("%llu %llu", &a, &b);
      printf("%llu\n", a * b);

      return 0;
}