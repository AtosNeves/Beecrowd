#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
  setlocale(LC_ALL, "");
  char led[100];

  int i, w = 0, soma = 0, a = 0;

  scanf("%d", &a);

  while (w < a)
  {
    scanf("%s", led);
    int t = strlen(led);

    for (i = 0; i < t; i++)
    {

      if (led[i] == '0')
      {
        soma = soma + 6;
      }

      else if (led[i] == '1')
      {
        soma = soma + 2;
      }

      else if (led[i] == '2')
      {
        soma = soma + 5;
      }
      else if (led[i] == '3')
      {
        soma = soma + 5;
      }
      else if (led[i] == '4')
      {
        soma = soma + 4;
      }
      else if (led[i] == '5')
      {
        soma = soma + 5;
      }
      else if (led[i] == '6')
      {
        soma = soma + 6;
      }
      else if (led[i] == '7')
      {
        soma = soma + 3;
      }
      else if (led[i] == '8')
      {
        soma = soma + 7;
      }
      else if (led[i] == '9')
      {
        soma = soma + 6;
      }
      if (i == (t - 1))
      {
        printf("%d leds\n", soma);
        soma = 0;
        break;
      }
    }

    w = w + 1;
  }

  return 0;
}