#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int e, m = -1;
      while (scanf("%d", &e) && e != 0)
      {
            if (e > m)
            {
                  m = e;
            }
      }
      printf("%d\n", m);
      return 0;
}