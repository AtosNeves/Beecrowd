#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int n1, m, n2;
      scanf("%d", &n1);
      scanf("%d", &m);
      n2 = 2 * m - n1;
      printf("%d\n", n2);

      return 0;
}