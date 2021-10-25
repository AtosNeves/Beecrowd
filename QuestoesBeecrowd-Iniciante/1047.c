#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
int main()
{
      int h1, m1, s1, h2, m2, s2, tempo, hr, min;

      scanf("%d %d %d %d", &h1, &m1, &h2, &m2);

      if (h2 <= h1 && m2 <= m1)
      {
            h2 = h2 + 24;
      }
      else if (m2 <= m1)
      {
            m2 = m2 + 60;
            h2 = h2 - 1;
      }

      s1 = (h1 * 3600) + (m1 * 60);
      s2 = (h2 * 3600) + (m2 * 60);

      tempo = (s2 - s1);
      hr = tempo / 3600;
      min = (tempo - (hr * 3600)) / 60;
      printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hr, min);
      return 0;
}