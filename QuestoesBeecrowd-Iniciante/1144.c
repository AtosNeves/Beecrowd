#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
   setlocale(LC_ALL, "");
   int entrada;
   scanf("%d", &entrada);
   int i, j, k, a1 = 1, a2 = 1, a3 = 1, b1 = 0, b2 = 0, b3 = 0;
   for (i = 0; i < entrada; i++)
   {

      for (j = 0; j < 1; j++)
      {

         printf("%d %d %d\n", a1, a2, a3);
         b1 = b1 + 1;
         b2 = a2 + 1;
         b3 = a3 + 1;
         printf("%d %d %d\n", b1, b2, b3);
         a1 = a1 + 1;
         a2 = a1 * a1;
         a3 = a2 * a1;
      }
   }

   return 0;
}
