#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <stdbool.h>

int corrida(float vf, float vg, double h)
{

      double f = 12 / vf;
      double g = h / vg;
      if (f >= g)
      {
            return 2;
      }
      else
      {
            return 1;
      }
}

int main()
{
      setlocale(LC_ALL, "");
      int d, vf, vg, vff, vgg;

      while (scanf("%d %d %d", &d, &vf, &vg) != EOF)
      {
            double x;
            x = sqrt(pow(12, 2) + pow(d, 2));
            //printf("%lf\n", x);
            int resultado = corrida(vf, vg, x);

            switch (resultado)
            {
            case 1:
                  printf("N\n");
                  break;
            case 2:
                  printf("S\n");
                  break;
            default:
                  break;
            }
      }

      return 0;
}