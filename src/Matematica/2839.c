#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      long int a;
      scanf("%d", &a);
      printf("%d\n", a + 1);

      return 0;
}