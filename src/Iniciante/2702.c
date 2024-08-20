#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int a, b, c, aa, bb, cc;
      scanf("%d %d %d", &a, &b, &c);
      scanf("%d %d %d", &aa, &bb, &cc);
      int ar, br, cr, r = 0;
      ar = a - aa;
      br = b - bb;
      cr = c - cc;
      if (a < aa)
      {
            r = r + aa - a;
      }
      if (bb > b)
      {
            r = r + bb - b;
      }
      if (cc > c)
      {
            r = r + cc - c;
      }

      printf("%d\n", r);

      return 0;
}