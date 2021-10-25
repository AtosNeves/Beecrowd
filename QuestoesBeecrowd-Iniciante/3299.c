#include <stdio.h>
#include <stdio.h>
#include <string.h>
int main(int argc, char const *argv[])
{
    char entrada[999999];
    scanf("%s", entrada);
    int i;
    int len = strlen(entrada);
    for (i = 1; i < len; i++)
    {
        if (entrada[i - 1] == '1' && entrada[i] == '3')
        {
            printf("%s es de Mala Suerte\n", entrada);
            return 0;
        }
    }
    printf("%s NO es de Mala Suerte\n", entrada);
    return 0;
}

