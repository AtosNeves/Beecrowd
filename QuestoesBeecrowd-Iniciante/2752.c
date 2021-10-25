#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      char f[50] = "AMO FAZER EXERCICIO NO URI";

      printf("<%s>\n", f);
      printf("<%30s>\n", f);
      printf("<%.20s>\n", f);
      printf("<%-20s>\n", f);
      printf("<%-30s>\n", f);
      printf("<%.30s>\n", f);
      printf("<%30.20s>\n", f);
      printf("<%-30.20s>\n", f);

      return 0;
}