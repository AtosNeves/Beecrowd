#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int hora, minuto;
      
      while (scanf("%d:%d", &hora, &minuto) != EOF)
      {
            // printf("%d %d\n", hora, minuto);

            if (hora == 5)
            {
                  printf("Atraso maximo: 0\n");
            }
            if (hora == 6)
            {
                  printf("Atraso maximo: 0\n");
            }

            if (hora == 7)
            {
                  printf("Atraso maximo: %d\n", minuto);
            }

            if (hora == 8)
            {
                  printf("Atraso maximo: %d\n", 60 + minuto);
            }
            if (hora == 9)
            {
                  printf("Atraso maximo: 120\n");
            }
      }
      return 0;
}
