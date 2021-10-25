#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
     setlocale(LC_ALL, "pt-br");
     int aa, bb;
     int a, b;
     a = 0;
     b = 1;
     int i, j;
     printf("I=0 J=1\n");
     printf("I=0 J=2\n");
     printf("I=0 J=3\n");
     bb = 2, aa = 2;
     for (j = 0; j < 4; j++)
     {

          b = 1;

          for (i = 1; i <= 3; i++)
          {

               printf("I=%d.%d J=%d.%d\n", a, aa, b, bb);
               b = b + 1;
          }

          bb = bb + 2;
          aa = aa + 2;
     }

     printf("I=1 J=2\n");
     printf("I=1 J=3\n");
     printf("I=1 J=4\n");
     a = 1, b = 2;
     bb = 2, aa = 2;

     for (j = 0; j < 4; j++)
     {

          b = 2;

          for (i = 1; i <= 3; i++)
          {

               printf("I=%d.%d J=%d.%d\n", a, aa, b, bb);
               b = b + 1;
          }

          bb = bb + 2;
          aa = aa + 2;
     }

     printf("I=2 J=3\n");
     printf("I=2 J=4\n");
     printf("I=2 J=5\n");

     return 0;
}