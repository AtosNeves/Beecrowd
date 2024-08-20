#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pr-br");
      int a, i;
      scanf("%d", &a);
      printf("Feliz nat");
      for (i = 0; i < a; i++)
      {
            printf("a");
      }
      printf("l!\n");

      return 0;
}
