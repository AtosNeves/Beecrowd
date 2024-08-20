#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
    setlocale(LC_ALL, "pt-br");
    double a, b, c, x1, x2;
    double delta;
    scanf("%lf %lf %lf", &a, &b, &c);
    delta = (b * b) - 4 * a * c;

    if (delta >= 0 && a != 0)
    {
        x1 = (-b + sqrt(delta)) / (2 * a);

        x2 = (-b - sqrt(delta)) / (2 * a);
        printf("R1 = %.5lf\n", x1);
        printf("R2 = %.5lf\n", x2);
    }
    else
    {
        printf("Impossivel calcular\n");
    }

    return 0;
}
