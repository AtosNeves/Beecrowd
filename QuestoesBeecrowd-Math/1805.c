#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      unsigned long long int a, b, i, soma = 0;
      scanf("%lld %lld", &a, &b);
      soma = ((b + a) * (b - a + 1)) / 2;

      printf("%llu\n", soma);
      return 0;
}