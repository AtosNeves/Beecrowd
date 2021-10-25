#include <stdlib.h>
#include <stdio.h>
int main(int argc, char const *argv[])
{

    int soma1 = 0, soma2 = 0, soma3 = 0, soma4 = 0;
    int i, entrada;
    int convertido[800000];
    convertido[0] = '\n';
    for (i = 0; i < 7; i++)
    {
        scanf("%d", &entrada);
        soma1 = soma1 + entrada;
    }
    entrada = 0;
    for (i = 0; i < 7; i++)
    {
        scanf("%d", &entrada);
        soma2 = soma2 + entrada;
    }
    entrada = 0;
    for (i = 0; i < 7; i++)
    {
        scanf("%d", &entrada);
        soma3 = soma3 + entrada;
    }
    entrada = 0;
    for (i = 0; i < 7; i++)
    {
        scanf("%d", &entrada);
        soma4 = soma4 + entrada;
    }
    entrada = 0;

    int somas[4] = {soma1, soma2, soma3, soma4};
    int maior = soma1;
    for (i = 0; i < 5; i++)
    {
        if (somas[i] > maior)
        {
            maior = somas[i];
        }
    }
    int resultado = maior;
    int contador = 0;
    while (maior >= 1)
    {
        convertido[contador] = maior % 2;
        maior = maior / 2;
        contador = contador + 1;
    }
    contador = contador - 1;

    printf("%d = ", resultado);
    while (contador >= 0)
    {

        printf("%d", convertido[contador]);
        contador = contador - 1;
    }

    printf("\n");

    return 0;
}
