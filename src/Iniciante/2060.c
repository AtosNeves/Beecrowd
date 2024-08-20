#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int c, t, i, m4 = 0, m3 = 0, m2 = 0, m5 = 0;

      scanf("%d", &c);
      int v[c];
      for (i = 0; i < c; i++)
      {
            scanf("%d", &v[i]);
      }
      i = 0;
      for (i = 0; i < c; i++)
      {
            if (v[i] % 2 == 0)
            {

                  m2 = m2 + 1;
            }
            if (v[i] % 3 == 0)
            {
                  m3 = m3 + 1;
            }
            if (v[i] % 4 == 0)
            {
                  m4 = m4 + 1;
            }
            if (v[i] % 5 == 0)
            {
                  m5 = m5 + 1;
            }
      }
      printf("%d Multiplo(s) de 2\n", m2);
      printf("%d Multiplo(s) de 3\n", m3);
      printf("%d Multiplo(s) de 4\n", m4);
      printf("%d Multiplo(s) de 5\n", m5);

      return 0;
}
