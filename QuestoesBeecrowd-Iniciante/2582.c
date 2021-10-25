#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char const *argv[])
{
    char entradaDoUsuario[16];
    int n,i;
    fgets(entradaDoUsuario, 16 + 1, stdin);
    n = atoi(entradaDoUsuario);

    char musicas[11][16];

    strcpy(musicas[0], "PROXYCITY");
    strcpy(musicas[1], "P.Y.N.G.");
    strcpy(musicas[2], "DNSUEY!");
    strcpy(musicas[3], "SERVERS");
    strcpy(musicas[4], "HOST!");
    strcpy(musicas[5], "CRIPTONIZE");
    strcpy(musicas[6], "OFFLINE DAY");
    strcpy(musicas[7], "SALT");
    strcpy(musicas[8], "ANSWER!");
    strcpy(musicas[9], "RAR?");
    strcpy(musicas[10], "WIFI ANTENNAS");

    int entradas[2];
    for (i = 0; i < n; i++)
    {
        scanf("%d %d", &entradas[0], &entradas[1]);

        int resultado = entradas[0] + entradas[1];

        printf("%s\n", musicas[resultado]);
    }

    return 0;
}