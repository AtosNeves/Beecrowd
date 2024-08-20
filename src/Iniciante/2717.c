#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int n, a, b;
      scanf("%d", &n);
      scanf("%d %d", &a, &b);
      if (a + b <= n)
      {
            printf("Farei hoje!\n");
      }
      else
      {
            printf("Deixa para amanha!\n");
      }

      return 0;
}