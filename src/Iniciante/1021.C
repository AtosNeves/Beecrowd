#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
    setlocale(LC_ALL, "pt-br");
    float valor;
    int quantidade;
    scanf("%f", &valor);

    quantidade = valor / 100;
    printf("NOTAS:\n");

    printf("%d nota(s) de R$ 100.00\n", quantidade);
    valor = fmod(valor, 100);
    /*
        50
        */
    quantidade = valor / 50;
    printf("%d nota(s) de R$ 50.00\n", quantidade);
    valor = fmod(valor, 50);
    /*
        20        
        */
    quantidade = valor / 20;
    printf("%d nota(s) de R$ 20.00\n", quantidade);
    valor = fmod(valor, 20);
    /*
        10
        */
    quantidade = valor / 10;
    printf("%d nota(s) de R$ 10.00\n", quantidade);
    valor = fmod(valor, 10);
    /*
        5
        */
    quantidade = valor / 5;
    printf("%d nota(s) de R$ 5.00\n", quantidade);
    valor = fmod(valor, 5);
    /*
        2
        */
    quantidade = valor / 2;
    printf("%d nota(s) de R$ 2.00\n", quantidade);
    valor = fmod(valor, 2);

    printf("MOEDAS:\n");
    quantidade = valor / 1;
    printf("%d moeda(s) de R$ 1.00\n", quantidade);
    valor = fmod(valor, 1);
    /*
        0.5
        */

    quantidade = valor / 0.5;
    printf("%d moeda(s) de R$ 0.50\n", quantidade);
    valor = fmod(valor, 0.5);
    /*
        0,.25
        */
    quantidade = valor / 0.25;
    printf("%d moeda(s) de R$ 0.25\n", quantidade);
    valor = fmod(valor, 0.25);
    /*
        0.10
        */
    quantidade = valor / 0.10;
    printf("%d moeda(s) de R$ 0.10\n", quantidade);
    valor = fmod(valor, 0.10);
    /*
        0,05
        */
    quantidade = valor / 0.05;
    printf("%d moeda(s) de R$ 0.05\n", quantidade);
    valor = fmod(valor, 0.05);
    /*
        0,01
        */
    valor = valor * 100;
    quantidade = valor;
    printf("%.0f moeda(s) de R$ 0.01\n", valor);

    return 0;
}