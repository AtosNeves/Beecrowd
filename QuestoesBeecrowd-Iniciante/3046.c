#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      unsigned int n, a;
      scanf("%d", &n);
      a = ((n + 1) * (n + 2)) / 2;

      printf("%d\n", a);

      return 0;
}