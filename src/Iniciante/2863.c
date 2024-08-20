#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      int q;
      float velocidade, record = 1000;
      while (scanf("%d", &q) != EOF)
      {
            while (q)
            {
                  scanf("%f", &velocidade);
                  if (velocidade < record)
                  {
                        record = velocidade;
                  }
                  q = q - 1;
            }
            printf("%.2f\n", record);
            record = 1000;
      }

      return 0;
}