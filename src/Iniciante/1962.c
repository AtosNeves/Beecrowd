#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      long int entrada, resultado = 0;
      int testes;
      scanf("%d", &testes);
      while (testes)
      {

            scanf("%li", &entrada);
            if (entrada < 2015)
            {
                  resultado = 2015 - entrada;
                  printf("%li D.C.\n", resultado);
            }

            else if (entrada > 2015)
            {
                  resultado = entrada - 2014;
                  printf("%li A.C.\n", resultado);
            }
            else if (entrada == 2015)
            {
                  printf("1 A.C.\n");
            }
            testes = testes - 1;
      }

      return 0;
}