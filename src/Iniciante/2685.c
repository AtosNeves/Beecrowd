#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int a;

      while (scanf("%d", &a) != EOF)
      {

            if (a >= 0 && a < 90 || a == 360)
            {
                  printf("Bom Dia!!\n");
            }
            else if (a >= 90 && a < 180)
            {
                  printf("Boa Tarde!!\n");
            }
            else if (a >= 180 && a < 270)
            {
                  printf("Boa Noite!!\n");
            }
            else if (a >= 270 && a < 360)
            {
                  printf("De Madrugada!!\n");
            }
      }

      return 0;
}