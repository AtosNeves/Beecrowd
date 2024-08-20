#include <stdio.h>
#include <stdlib.h>

int organizador(int trem[], int tamanho)
{
    int c = 0;
    int temp;
    for (int i = 1; i < tamanho; i++)
    {
        for (int j = 0; j < tamanho - 1; j++)
        {
            if (trem[j] > trem[j + 1])
            {

                temp = trem[j];
                trem[j] = trem[j + 1];
                trem[j + 1] = temp;
                c++;
            }
        }
    }

    return c;
}

int main()
{

    int testes;
    scanf("%d", &testes);
    for (int i = 0; i < testes; i++)
    {
        int tamanho;
        scanf("%d", &tamanho);
        int trem[tamanho];
        for (int j = 0; j < tamanho; j++)
        {
            scanf("%d", &trem[j]);
        }
        int q = organizador(trem, tamanho);

        printf("Optimal train swapping takes %d swaps.\n", q);
    }

    return 0;
}
