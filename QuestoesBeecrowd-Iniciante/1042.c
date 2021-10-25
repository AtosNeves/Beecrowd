#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
    setlocale(LC_ALL, "pt-br");
    int array[3], u, contador, v, i;
    scanf("%d %d %d", &array[0], &array[1], &array[2]);
    int a, b, c;
    a = array[0], b = array[1], c = array[2];
    for (contador = 1; contador < 3; contador++)
    {
        for (i = 0; i < 3 - 1; i++)
        {
            if (array[i] > array[i + 1])
            {
                u = array[i];
                array[i] = array[i + 1];
                array[i + 1] = u;
            }
        }
    }
    for (v = 0; v < 3; v++)
    {
        printf("%d\n", array[v]);
    }
    printf("\n");
    printf("%d\n%d\n%d\n", a, b, c);

    return 0;
}