#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
   setlocale(LC_ALL, "pt-br");
   int valor, quantidade;

   scanf("%d", &valor);
   printf("%d\n", valor);

   /*
nota de 100
*/
   quantidade = valor / 100;
   printf("%d nota(s) de R$ 100,00\n", quantidade);
   valor = valor % 100;

   /*
nota de 50
*/
   quantidade = valor / 50;
   printf("%d nota(s) de R$ 50,00\n", quantidade);
   valor = valor % 50;

   /*
notas de 20
*/
   quantidade = valor / 20;
   printf("%d nota(s) de R$ 20,00\n", quantidade);
   valor = valor % 20;

   /*
nota de 10
*/

   quantidade = valor / 10;
   printf("%d nota(s) de R$ 10,00\n", quantidade);
   valor = valor % 10;

   /*
notas de 5
*/
   quantidade = valor / 5;
   printf("%d nota(s) de R$ 5,00\n", quantidade);
   valor = valor % 5;
   /*
notas de 2
*/
   quantidade = valor / 2;
   printf("%d nota(s) de R$ 2,00\n", quantidade);
   valor = valor % 2;

   /*
notas de 1
*/
   ;
   printf("%d nota(s) de R$ 1,00\n", valor);

   return 0;
}