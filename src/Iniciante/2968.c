#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int a, b, i;
      scanf("%d %d", &a, &b);
      long double s;
      double c = a * b;
      for (i = 10; i <= 90; i = i + 10)
      {

            if ((fmod(c * i, 100) == 0))
            {
                  if (i == 90)
                  {
                        printf("%.0lf\n", floor(((c * i) / 100)));
                  }
                  else
                        printf("%.0lf ", floor(((c * i) / 100)));
            }
            else
            {
                  if (i == 90)
                  {
                        printf("%.0lf\n", floor(((c * i) / 100)+1));
                  }
                  else
                        printf("%.0lf ",floor( ((c * i) / 100)+1));
            }
      }

      //printf("\n");
      return 0;
}