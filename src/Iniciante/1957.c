#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      unsigned long int entrada;
      scanf("%lu", &entrada);
      int conversor[900000];
      int passo = 0;
      int contador;
      while (entrada >= 16)

      {
            conversor[passo] = entrada % 16;
            entrada = entrada / 16;
            passo = passo + 1;
      }
      conversor[passo] = entrada;
      int i;

      int primeiro = passo;
      int convertido[900000];

      for (i = 0; i <= primeiro; i++)
      {

            convertido[i] = conversor[passo];
            passo = passo - 1;
      }

      for (i = 0; i <= primeiro; i++)
      {

            switch (convertido[i])
            {
            case 10:
                  printf("A");
                  break;
            case 11:
                  printf("B");
                  break;
            case 12:
                  printf("C");
                  break;
            case 13:
                  printf("D");
                  break;
            case 14:
                  printf("E");
                  break;
            case 15:
                  printf("F");
                  break;

            default:
                  printf("%d", convertido[i]);
                  break;
            }
      }
      printf("\n");
      return 0;
}