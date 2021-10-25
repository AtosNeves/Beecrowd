#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main()
{
    double pi = 3.14159;
    double r, a;
    scanf("%lf", &r);
    a = pi * pow(r, 2);
    printf("A=%.4lf\n", a);
    return 0;
}
