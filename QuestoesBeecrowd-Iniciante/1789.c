#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int teste, maior = 0, a = 0, lesmas;

      int i;

      while (scanf("%d", &teste) != EOF)
      {

            for (i = 0; i < teste; i++)
            {
                  scanf("%d", &lesmas);
                  if (lesmas > maior)
                  {
                        maior = lesmas;
                  }
            }
            if (maior < 10)
                  a = 1;
            else if (maior >= 10 && maior < 20)
            {
                  a = 2;
            }
            else
                  a = 3;

            printf("%d\n", a);

            maior = 0;
      }

      return 0;
}