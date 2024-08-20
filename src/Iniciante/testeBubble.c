#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
    setlocale(LC_ALL, "pt-br");
    int arr[5], contador, i, aux;

    scanf("%d %d %d %d %d", &arr[0], &arr[1], &arr[2], &arr[3], &arr[4]);

    for (contador = 1; contador < 5; contador++)
    {
        for (i = 0; i < 4; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                aux = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = aux;
            }
        }
    }
    for (contador = 0; contador < 5; contador++)
    {
        printf("%d\n", arr[contador]);
    }

    return 0;
}