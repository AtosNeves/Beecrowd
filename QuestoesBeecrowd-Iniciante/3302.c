#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
    int i, entrada;
    int testes;
    scanf("%d", &testes);
    for (i = 0; i < testes; i++)
    {
        scanf("%d", &entrada);
        printf("resposta %d: %d\n", i + 1, entrada);
    }

    return 0;
}
