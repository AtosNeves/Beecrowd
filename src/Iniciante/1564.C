#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int entrada, a;

      while ((scanf("%d", &entrada) != EOF))
      {

            if (entrada == 0)
            {
                  printf("Vai ter copa!\n");
            }
            else if (entrada >= 1)
            {
                  printf("Vai ter duas!\n");
            }
      }

      return 0;
}