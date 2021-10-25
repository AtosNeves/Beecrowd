#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>
int calc(int a, int b, int menor)
{
      int c;
      c = a + b;
      int x = 3 * menor - c;
      return x;
}
int main()
{
      setlocale(LC_ALL, "");
      int a, b, menor;

      while (scanf("%d %d", &a, &b) && (a && b) != 0)
      {
            menor = a;
            if (menor > b)
            {

                  menor = b;
            }
            int c = a + b;
            int resultado = calc(a, b, menor);
            printf("%d\n", resultado);
      }
      return 0;
}