#include <stdlib.h>
#include <stdio.h>
#include <string.h>
int main(int argc, char const *argv[])
{
    char palavra[21];

    while (scanf("%s", palavra) != EOF)
    {
        int len = strlen(palavra);
        if (len < 10)
        {
            printf("palavrinha\n");
        }
        else
        {
            printf("palavrao\n");
        }
    }

    return 0;
}
