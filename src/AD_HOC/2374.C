#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int a, b;
      scanf("%d", &a);
      scanf("%d", &b);
      printf("%d", a - b);

      return 0;
}