#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

float consumo(float a, float b)
{

   float c = a / b;
   return (c);
}

int main()
{
   setlocale(LC_ALL, "pt-br");
   float x;
   float y;
   float c;

   scanf("%f", &x);
   scanf("%f", &y);

   c = consumo(x, y);
   printf("%.3f km/l\n", c);
   return 0;
}
