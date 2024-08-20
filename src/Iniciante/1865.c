#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char nome[100];
      int i, a;
      scanf("%d", &a);
      for (i = 0; i < a; i++)
      {
            scanf("%s %*d", &nome);

            if (strcmp(nome, "Thor") == 00)
            {
                  printf("Y\n");
            }
            else
            {
                  printf("N\n");
            }
      }

      return 0;
}