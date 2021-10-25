#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      long int a;
      scanf("%ld", &a);
      printf("%ld\n", a - 2);

      return 0;
}