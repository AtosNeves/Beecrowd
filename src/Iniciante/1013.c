#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int zega(int a, int b, int c)
{
    int m, n;
    m = ((a + b + abs(a - b)) / 2);
    n = ((m + c + abs(m - c)) / 2);
    return (n);
}

int main()
{

    int v1, v2, v3, n;
    scanf("%d %d %d", &v1, &v2, &v3);
    n = zega(v1, v2, v3);
    printf("%d eh o maior\n", n);

    return 0;
}
