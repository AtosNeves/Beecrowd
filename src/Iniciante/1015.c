#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

float distancia(float a, float b, float c, float e)
{

    float dd;
    dd = sqrt(pow((c - a), 2) + pow((e - b), 2));
    return (dd);
}

int main()
{
    setlocale(LC_ALL, "pt-br");
    float x1, y1, x2, y2, dd;

    scanf("%f %f", &x1, &y1);
    scanf("%f %f", &x2, &y2);

    dd = distancia(x1, y1, x2, y2);
    printf("%.4f\n", dd);
    return 0;
}