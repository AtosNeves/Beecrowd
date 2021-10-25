#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
    setlocale(LC_ALL, "pt-br");
    float a, b, c, aa, bb, cc;
    scanf("%f %f %f", &a, &b, &c);
    if ((a - b) < 0)
    {
        aa = -(a - b);
    }
    if ((b - c) < 0)
    {
        bb = -(b - c);
    }
    if ((c - a) < 0)
    {
        cc = -(c - a);
    }

    if (a + b > c && a + c > b && b + c > a)
    {

        printf("Perimetro = %.1f\n", a + b + c);
    }
    else
    {
        printf("Area = %.1f\n", ((a + b) * c) / 2);
    }

    return 0;
}