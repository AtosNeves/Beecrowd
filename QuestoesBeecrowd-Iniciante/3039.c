#include <stdio.h>
#include <stdlib.h>
int main()
{
    int testes, i;
    int m = 0, f = 0;
    scanf("%d", &testes);
    char escolha[2];
    for (i = 0; i < testes; i++)
    {
        scanf("%*s %c", &escolha[0]);
        switch (escolha[0])
        {
        case 'M':
            m = m + 1;
            break;
        case 'F':
            f = f + 1;
            break;
        default:
            break;
        }
        }
    printf("%d carrinhos\n", m);
    printf("%d bonecas\n", f);
    return 0;
}
