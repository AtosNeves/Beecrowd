#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char const *argv[])
{
    int i, b = 0, a = 0, m = 0, d = 0, entrada = 0, testes;
    
    char e[20];
    scanf("%d", &testes);
    for (i = 0; i < testes; i++)
    {
        scanf("%*s %s %d", &e, &entrada);
        if (strcmp(e,"bonecos")==0)
        {
            b = b + entrada;
        }
        if (strcmp(e,"arquitetos")==0)
        {
            a = a + entrada;
        }
        if (strcmp(e,"musicos")==0)
        {
            m = m + entrada;
        }
        if (strcmp(e,"desenhistas")==0)
        {
            d = d + entrada;
        }
    }

    b = b / 8;
    a = a / 4;
    m = m / 6;
    d = d / 12;
    printf("%d\n", a + b + m + d);

    return 0;
}
