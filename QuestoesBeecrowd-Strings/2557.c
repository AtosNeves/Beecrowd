#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

int main()
{
      setlocale(LC_ALL, "");
      char *sub;
      char s1[999999], s3[999999], s2[999999];
      char entrada[10];
      while (scanf("%s", &entrada) != EOF)
      {
            sub = strtok(entrada, "+ =");
            strcpy(s1, sub);

            sub = strtok(NULL, "+ =");
            strcpy(s2, sub);

            sub = strtok(NULL, "+ =");
            strcpy(s3, sub);
            //printf("%s     %s     %s", s1, s2, s3);
            int sr3 = atoi(s3);
            int sr2 = atoi(s2);
            int sr1 = atoi(s1);
            //printf("%d %d\n\n\n", sr1, sr2);
            if (s1[0] == 'R')
            {

                  printf("%d\n", sr3 - sr2);
            }
            if (s2[0] == 'L')
            {
                  printf("%d\n", sr3 - sr1);
            }
            if (s3[0] == 'J')
            {
                  printf("%d\n", sr1 + sr2);
            }
            entrada[0] = '\n';
      }
      return 0;
}