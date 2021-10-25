#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
   setlocale(LC_ALL, "pt-br");

   int a, b, c, d;
   scanf("%d %d", &a, &b);

   c = 24 - a;
   d = c + b;
   if (d > 24)
   {
      printf("O JOGO DUROU %d HORA(S)\n", b - a);
   }
   else
   {
      printf("O JOGO DUROU %d HORA(S)\n", d);
   }

   return 0;
}