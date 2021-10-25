#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
        setlocale(LC_ALL, "pt-br");
        float c1, c2;
        scanf("%f %f", &c1, &c2);

        if (c1 > 0 && c2 > 0)
        {
                printf("Q1\n");
        }

        if (c1 < 0 && c2 > 0)
        {
                printf("Q2\n");
        }
        if (c1 < 0 && c2 < 0)
        {
                printf("Q3\n");
        }
        if (c1 > 0 && c2 < 0)
        {
                printf("Q4\n");
        }
        if (c1 == 0 && c2 == 0)
        {
                printf("Origem\n");
        }
        if (c1 == 0 && c2 != 0)
        {
                printf("Eixo Y\n");
        }
        if (c2 == 0 && c1 != 0)
        {
                printf("Eixo X\n");
        }

        return 0;
}