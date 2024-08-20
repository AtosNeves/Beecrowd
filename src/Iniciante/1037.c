#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
    setlocale(LC_ALL, "pt-br");
    float entrada;

    scanf("%f", &entrada);

    if (0 <= entrada && entrada <= 25)
    {
        printf("Intervalo [0,25]\n");
    }
    else if (25 < entrada && entrada <= 50)
    {
        printf("Intervalo (25,50]\n");
    }
    else if (50 < entrada && entrada <= 75)
    {
        printf("Intervalo (50,75]\n");
    }
    else if (75 < entrada && entrada <= 100)
    {
        printf("Intervalo (75,100]\n");
    }
    else
    {
        printf("Fora de intervalo\n");
    }

    return 0;
}