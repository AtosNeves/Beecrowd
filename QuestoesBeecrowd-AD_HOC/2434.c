#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
      setlocale(LC_ALL, "");
      int i, entrada, q, menor, valor, saldo;
      scanf("%d %d", &q, &entrada);
      menor = entrada;
      saldo = entrada;
      for (i = 0; i < q; i++)

      {

            scanf("%d", &valor);

            saldo = saldo + valor;
            if (saldo < menor)
            {
                  menor = saldo;
            }
      }
      printf("%d\n", menor);
      saldo = 0, menor = 0, entrada = 0;

      return 0;
}