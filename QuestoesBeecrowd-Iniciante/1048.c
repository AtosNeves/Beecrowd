#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "pt-br");
      float salario, salario2;
      scanf("%f", &salario);

      if (salario >= 0 && salario <= 400)
      {
            salario2 = salario + (salario * 0.15);
            printf("Novo salario: %.2f\n", salario2);
            printf("Reajuste ganho: %.2f\n", salario * 0.15);
            printf("Em percentual: 15 %\n");
      }
      if (salario >= 400.01 && salario <= 800)
      {
            salario2 = salario + (salario * 0.12);
            printf("Novo salario: %.2f\n", salario2);
            printf("Reajuste ganho: %.2f\n", salario * 0.12);
            printf("Em percentual: 12 %\n");
      }
      if (salario >= 800.01 && salario <= 1200)
      {
            salario2 = salario + (salario * 0.10);
            printf("Novo salario: %.2f\n", salario2);
            printf("Reajuste ganho: %.2f\n", salario * 0.10);
            printf("Em percentual: 10 %\n");
      }
      if (salario >= 1200.01 && salario <= 2000)
      {
            salario2 = salario + (salario * 0.07);
            printf("Novo salario: %.2f\n", salario2);
            printf("Reajuste ganho: %.2f\n", salario * 0.07);
            printf("Em percentual: 7 %\n");
      }

      if (salario > 2000)
      {
            salario2 = salario + (salario * 0.04);
            printf("Novo salario: %.2f\n", salario2);
            printf("Reajuste ganho: %.2f\n", salario * 0.04);
            printf("Em percentual: 4 %\n");
      }

      return 0;
}