#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char a[128];
      int i;
      fgets(a, 128, stdin);
      int len = strlen(a);

      for (i = 0; i < len; i++)
      {

            if (a[i] == ',')
            {
                  a[i] = '\n\n';
            }
      }
      printf("%s", a);

      return 0;
}