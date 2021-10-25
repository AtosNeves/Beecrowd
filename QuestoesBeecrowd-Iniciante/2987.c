#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char letra[1];
      char letras[27][27] = {"", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
      int i;
      scanf("%s", &letra);
      for (i = 0; i < 27; i++)
      {
            if (strcmp(letra, letras[i]) == 0)
            {
                  printf("%d\n", i);
            }
      }

      return 0;
}