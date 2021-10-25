#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      int q;
      int anao = 0, elfos = 0, humanos = 0, magos = 0, hobbit = 0;
      char a[2];
      scanf("%d", &q);
      while (q)
      {

            scanf("%*s %c", &a);
            switch (a[0])
            {
            case 'A':
                  anao = anao + 1;
                  break;
            case 'E':
                  elfos = elfos + 1;
                  break;
            case 'H':
                  humanos = humanos + 1;
                  break;
            case 'M':
                  magos = magos + 1;
                  break;
            case 'X':
                  hobbit = hobbit + 1;

                  break;
            default:
                  break;
            }
            q = q - 1;
      }
      printf("%d Hobbit(s)\n", hobbit);
      printf("%d Humano(s)\n", humanos);
      printf("%d Elfo(s)\n", elfos);
      printf("%d Anao(s)\n", anao);
      printf("%d Mago(s)\n", magos);
      return 0;
}