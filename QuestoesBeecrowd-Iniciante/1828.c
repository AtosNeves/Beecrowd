#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char a[15], b[15];
      int c, i, retorno, e = 2;
      scanf("%d", &c);
      for (i = 1; i <= c; i++)
      {
            scanf("%s %s", &a, &b);

            if (strcmp(a, "tesoura") == 0 && strcmp(b, "papel") == 0)
            {
                  printf("Caso #%d: Bazinga!\n", i);
            }
            else if (strcmp(a, "papel") == 0 && strcmp(b, "pedra") == 0)
            {
                  printf("Caso #%d: Bazinga!\n", i);
            }

            else if (strcmp(a, "pedra") == 0 && strcmp(b, "lagarto") == 0)
            {
                  printf("Caso #%d: Bazinga!\n", i);
            }

            else if (strcmp(a, "lagarto") == 0 && strcmp(b, "Spock") == 0)
            {
                  printf("Caso #%d: Bazinga!\n", i);
            }
            else if (strcmp(a, "Spock") == 0 && strcmp(b, "tesoura") == 0)
            {
                  printf("Caso #%d: Bazinga!\n", i);
            }
            else if (strcmp(a, "tesoura") == 0 && strcmp(b, "lagarto") == 0)
            {
                  printf("Caso #%d: Bazinga!\n", i);
            }
            else if (strcmp(a, "lagarto") == 0 && strcmp(b, "papel") == 0)
            {
                  printf("Caso #%d: Bazinga!\n", i);
            }
            else if (strcmp(a, "papel") == 0 && strcmp(b, "Spock") == 0)
            {
                  printf("Caso #%d: Bazinga!\n", i);
            }
            else if (strcmp(a, "Spock") == 0 && strcmp(b, "pedra") == 0)
            {
                  printf("Caso #%d: Bazinga!\n", i);
            }
            else if (strcmp(a, "pedra") == 0 && strcmp(b, "tesoura") == 0)
            {
                  printf("Caso #%d: Bazinga!\n", i);
            }

            else if (strcmp(a, b) == 0)
            {

                  printf("Caso #%d: De novo!\n", i);
            }
            else
            {

                  e = 0;
            }
            if (e == 0)
            {
                  printf("Caso #%d: Raj trapaceou!\n", i);
            }

            e = 2;
      }

      return 0;
}