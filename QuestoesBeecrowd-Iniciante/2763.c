#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char cpf[16];
      int i;
      scanf("%s", &cpf);

      for (i = 0; i < 15; i++)
      {

            if (cpf[i] == '.' || cpf[i] == '-')
            {
                  printf("\n");
                  i = i + 1;
            }
            if (i == 14)
            {
                  printf("\n");
            }

            else
            {
                  printf("%c", cpf[i]);
            }
      }
      //printf("\n");

      return 0;
}