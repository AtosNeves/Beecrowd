#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      unsigned long long int ho, contador = 1;

      scanf("%llu", &ho);
      while (contador < ho)
      {
            printf("Ho ");
            contador = contador + 1;
      }

      printf("Ho!");

      return 0;
}