#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main(int argc, char const *argv[])
{
    int testes;
    int x, y, i;
    int m, n;

    while (scanf("%d", &testes) != 0)
    {
        scanf("%d %d", &x, &y);
        for (i = 0; i < testes; i++)
        {
            scanf("%d %d", &m, &n);
            if (m == x || n == y)
            {
                printf("divisa\n");
            }
            else if (m > x && n > y)
            {
                printf("NE\n");
            }
            else if (m < x && n > y)
            {
                printf("NO\n");
            }
            else if (m > x && n < y)
            {
                printf("SE\n");
            }
            else if (m < x && n < y)
            {
                printf("SO\n");
            }
        }
    }

    return 0;
}
