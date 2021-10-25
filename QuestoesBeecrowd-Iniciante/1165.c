#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

float perfeito(int a1)
{

   int a, j, b, p;
   b = 0;
   for (j = 2; j < a1; j++)
   {
      if (a1 % j == 0)
      {
         b = b + 1;
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
      if (b > 0)
      {
         printf("%d nao eh primo\n", a);
      }
      if (b == 0)
      {
         printf("%d eh primo\n", a);
      }
      b = 1;
   }
   return 0;
}
