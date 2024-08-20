#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int s, t, f, r;
      scanf("%d %d %d", &s, &t, &f);

      r = s + t + f;
      if (r > 24)
      {
            r = r - 24;
      }
      else
      {if (r<0)
      {
            r = 24-(-r);
      }
      
      }
      if (r==24)
      {
            r=0;
      }
      

      printf("%d\n", r);
      return 0;
}