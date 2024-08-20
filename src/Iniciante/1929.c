#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main(void)
{
      setlocale(LC_ALL, "");
      int m[4] = {0}, aux = 0, i, j;
      scanf("%d %d %d %d", &m[0], &m[1], &m[2], &m[3]);

      for (i = 1; i < 4; i++)
      {

            for (j = 0; j < 3; j++)
            {

                  if (m[j] > m[j + 1])
                  {

                        aux = m[j];
                        m[j] = m[j + 1];
                        m[j + 1] = aux;
                  }
            }
      }

      if ((m[0] + m[1]) > m[2] || (m[0] + m[1]) > m[3] || (m[1] + m[2]) > m[3])
      {
            printf("S\n");
      }
      else
            printf("N\n");

      return 0;
}