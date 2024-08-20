#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>
int somajoao(int a, int b)
{

      int c = a * b;
      return c;
}
int somamaria(int a, int b)
{

      int c = a * b;
      return c;
}
int main()
{
      setlocale(LC_ALL, "");
      int q, i, somaj, somam;
      int x, d;

      scanf("%d", &q);

      while (q)
      {

            for (i = 0; i < 3; i++)
            {
                  scanf("%d %d", &x, &d);
                  somaj = somaj + somajoao(x, d);
            }
            for (i = 0; i < 3; i++)
            {
                  scanf("%d %d", &x, &d);
                  somam = somam + somamaria(x, d);
            }
            if (somam > somaj)
            {
                  printf("MARIA\n");
            }
            if (somam < somaj)
            {
                  printf("JOAO\n");
            }
            q = q - 1;
            somam = 0;
            somaj = 0;
      }

      return 0;
}