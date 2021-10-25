#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int senha = 0, a = 1;
      while (scanf("%d", &senha) != EOF)
      {

            printf("%d\n", senha - 1);
      }

      return 0;
}