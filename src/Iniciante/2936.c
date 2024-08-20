#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#define c 300
#define boi 1500
#define boto 600
#define m 1000
#define lara 150
#define chica 225

int main()
{
      setlocale(LC_ALL, "");
      int q1, q2, q3, q4, q5;
      scanf("%d %d %d %d %d", &q1, &q2, &q3, &q4, &q5);
      printf("%d\n", q1 * c + q2 * boi + q3 * boto + q4 * m + q5 * lara + chica);

      return 0;
}