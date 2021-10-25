#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int rafael(int x, int y)
{

      long long rafa = pow((3 * x), 2) + pow(y, 2);
      return rafa;
}
int beto(int x, int y)
{
      long int betoo = 2 * pow(x, 2) + pow((5 * y), 2);
      return betoo;
}
int carlos(int x, int y)
{

      long int carloss = -100 * x + pow(y, 3);
      return carloss;
}

int main()
{
      setlocale(LC_ALL, "");
      int x1, y1;
      int testes;
      scanf("%d", &testes);
      while (testes)
      {

            scanf("%d %d", &x1, &y1);

            long int r1 = rafael(x1, y1);
            long int b1 = beto(x1, y1);
            long int c1 = carlos(x1, y1);

            long int maior = r1;
            int v = 1;
            if (maior < c1)
            {
                  maior = c1;
                  v = 3;
            }

            if (maior < b1)
            {
                  maior = b1;
                  v = 2;
            }
            else if (maior < c1)
            {
                  maior = c1;
                  v = 3;
            }

            switch (v)
            {
            case 1:
                  printf("Rafael ganhou\n");
                  break;
            case 2:
                  printf("Beto ganhou\n");
                  break;
            case 3:
                  printf("Carlos ganhou\n");
                  break;
            default:
                  break;
            }
            testes = testes - 1;
      }
      return 0;
}