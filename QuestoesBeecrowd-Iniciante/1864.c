#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      char frase[40] = "LIFE IS NOT A PROBLEM TO BE SOLVED";
      int i, a, d = 10;

      scanf("%d", &a);

      for (i = 0; i < a; i++)
      {
            printf("%c", frase[i]);
      }
      printf("\n");

      return 0;
}