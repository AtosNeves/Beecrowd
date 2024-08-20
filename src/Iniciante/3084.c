#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>
#define ANGULOH 360 / 12
#define ANGULOM 360 / 60
int main()
{
      setlocale(LC_ALL, "");
      int a, b, contadorh = 0, contadorm = 0;
      while (scanf("%d %d", &a, &b) != EOF)
      {

            while (a >= 30)
            {
                  a = a - ANGULOH;
                  contadorh = contadorh + 1;
            }
            b = b * 60 / 360;
            //printf("%d %d\n", contadorh, b);
            //contadorh = 0;

            if (contadorh < 10)
            {
                  printf("0%d:", contadorh);
            }
            if (contadorh >= 10)
            {
                  printf("%d:", contadorh);
            }
            if (b < 10)
            {
                  printf("0%d\n", b);
            }

            if (b >= 10)
            {
                  printf("%d\n", b);
            }
            contadorh = 0;
      }
      return 0;
}