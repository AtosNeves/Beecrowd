#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int minutos(int d)
{

    int distancia;
    distancia = d * 2;
    return (distancia);
}

int main()
{
    setlocale(LC_ALL, "pt-br");
    int m, distancia;

    scanf("%d", &m);
    distancia = minutos(m);
    printf("%d minutos\n", distancia);

    return 0;
}