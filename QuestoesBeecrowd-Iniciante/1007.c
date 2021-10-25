#include <stdio.h>
#include <stdlib.h>

int diferenca(int a, int b, int c, int d)
{

    int dif;
    dif = (a * b - c * d);
    return (dif);
}

int main()
{
    int a1, b1, c1, d1, dif;
    scanf("%d", &a1);
    scanf("%d", &b1);
    scanf("%d", &c1);
    scanf("%d", &d1);
    dif = diferenca(a1, b1, c1, d1);
    printf("DIFERENCA = %d\n", dif);

    return 0;
}
