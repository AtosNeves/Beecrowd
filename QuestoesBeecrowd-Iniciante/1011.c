#include <stdio.h>
#include <stdlib.h>

double formula(double r)
{

    double raio;
    raio = (4.0 / 3) * 3.14159 * r * r * r;
    return (raio);
}

int main()
{
    double rr, volume;
    scanf("%lf", &rr);
    volume = formula(rr);
    printf("VOLUME = %.3lf\n", volume);
    return 0;
}
