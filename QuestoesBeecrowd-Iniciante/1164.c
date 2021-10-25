#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

float perfeito(int a1)
{

   int j, b;
   b = 0;
   for (j = 1; j < a1; j++)
   {
      if (fmod(a1, j) == 0)
      {
         b = b + j;
      }
   }
   return (b);
   printf("%d\n", b);
}

int main()
{
   setlocale(LC_ALL, "pt-br");
   int a, b, p, g, h;
   scanf("%d", &g);

   for (h = 0; h < g; h++)
   {
      scanf("%d", &a);
      b = perfeito(a);

      if (b == a)
      {
         printf("%d eh perfeito\n", a);
      }

      if (b != a)
      {
         printf("%d nao eh perfeito\n", a);
      }
   }
   return 0;
}
