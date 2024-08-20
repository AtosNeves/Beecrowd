#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
    setlocale(LC_ALL, "pt-br");
    int codigo, quantidade;
    float total;
    scanf("%d %d", &codigo, &quantidade);

    if (codigo == 1)
    {
        total = quantidade * 4;
        printf("Total: R$ %.2f\n", total);
    }

    if (codigo == 2)
    {
        total = quantidade * 4.5;
        printf("Total: R$ %.2f\n", total);
    }

    if (codigo == 3)
    {
        total = quantidade * 5;
        printf("Total: R$ %.2f\n", total);
    }

    if (codigo == 4)
    {
        total = quantidade * 2;
        printf("Total: R$ %.2f\n", total);
    }

    if (codigo == 5)
    {
        total = quantidade * 1.5;
        printf("Total: R$ %.2f\n", total);
    }

    return 0;
}
