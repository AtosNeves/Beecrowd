#include <stdlib.h>
#include <stdio.h>

int main(int argc, char const *argv[])
{

    int h, z, l, i, j, aux;
    int s[3];
    scanf("%d %d %d", &s[0], &s[1], &s[2]);
    h = s[0],
    z = s[1];
    l = s[2];
    for (i = 1; i < 3; i++)
    {
        for (j = 0; j < 2; j++)
        {
            if (s[j] > s[j + 1])
            {
                aux = s[j];
                s[j] = s[j + 1];
                s[j + 1] = aux;
            }
        }
    }
    if (s[1] == h)
    {
        printf("huguinho\n");
    }
    if (s[1] == z)
    {
        printf("zezinho\n");
    }
    if (s[1] == l)
    {
        printf("luisinho\n");
    }

    printf("\n");
    return 0;
}
