#include <stdio.h>
#include <stdlib.h>

int main()
{

    double a, b, c;
    scanf("%lf %lf %lf", &a, &b, &c);

    //area triangulo
    printf("TRIANGULO: %.3lf\n", (a * c) / 2);

    //area circulo
    printf("CIRCULO: %.3lf\n", 3.14159 * c * c);

    //area trapezio
    printf("TRAPEZIO: %.3lf\n", (a + b) * c / 2);

    //area quadrado
    printf("QUADRADO: %.3lf\n", b * b);

    //area retannglo
    printf("RETANGULO: %.3lf\n", a * b);

    return 0;
}
