#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int a;
      scanf("%d", &a);
      if (a == 1)
      {
            printf("Top 1\n");
      }
      if (2 <= a && a <= 3)
      {
            printf("Top 3\n");
      }
      if (3 < a && a <= 5)
      {
            printf("Top 5\n");
      }
      if (5 < a && a <= 10)
      {
            printf("Top 10\n");
      }
      if (10 < a && a <= 25)
      {
            printf("Top 25\n");
      }
      if (25 < a && a <= 50)
      {
            printf("Top 50\n");
      }
      if (50 < a && a <= 100)
      {
            printf("Top 100\n");
      }

      return 0;
}