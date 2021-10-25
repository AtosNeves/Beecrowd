#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int l, r;
      while (scanf("%d %d", &l, &r) && (l && r) != 0)
      {
            printf("%d\n", l + r);
      }

      return 0;
}