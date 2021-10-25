#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>
int lava(int a, int la, int lb, int sa, int sb)
{
      bool verifica = false;
      if (sa <= a && a <= sb && la <= a && a <= lb)
      {
            verifica = true;
      }

      return verifica;
}

int main()
{
      setlocale(LC_ALL, "");
      bool v;
      int n, la, lb, sa, sb;
      scanf("%d", &n);
      scanf("%d %d", &la, &lb);
      scanf("%d %d", &sa, &sb);
      v = lava(n, la, lb, sa, sb);
      switch (v)
      {
      case true:
            printf("possivel\n");
            break;

      default:
            printf("impossivel\n");
            break;
      }
      return 0;
}