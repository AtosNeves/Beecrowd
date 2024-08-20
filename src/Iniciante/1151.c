#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
  setlocale(LC_ALL, "pt-br");
  int i, b, d = 0;
  int f[60];
  f[1] = 1;
  f[0] = 0;
  f[2] = 2;
  scanf("%d", &b);
  if (b >= 2)
  {
    for (i = 0; i < b - 1; i++)
    {

      f[i + 2] = f[i + 1] + f[i];
      printf("%d ", f[i]);
      d = d + 1;
    }
  }
  printf("%d", f[d]);
  printf("\n");

  return 0;
}
