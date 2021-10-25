#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char frase[500] = {};
      int len;

      fgets(frase, 500, stdin);
      len = strlen(frase);

      if (len > 141)
      {
            printf("MUTE\n");
      }
      else
      {
            printf("TWEET\n");
      }

      return 0;
}